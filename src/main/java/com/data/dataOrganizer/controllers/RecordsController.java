package com.data.dataOrganizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.data.dataOrganizer.models.Records;
import com.data.dataOrganizer.repository.RecordsRepository;
import com.data.dataOrganizer.services.RecordsService;

@Controller
public class RecordsController {

	@Autowired
	private RecordsService recordsService;
	
	@Autowired
	private RecordsRepository recordsRepository;
	
	// display list of records
	//@GetMapping("/")
	@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public String viewHomePage(Model model, String title) { //added in title!
		return findPaginated(1, "title", "asc", model);		
	}
	
	//@GetMapping("/showNewRecordsForm")
	@RequestMapping(value="/showNewRecordsForm", method = {RequestMethod.GET, RequestMethod.POST})
	public String showNewRecordsForm(Model model) {
		// create model attribute to bind form records
		Records records = new Records();
		model.addAttribute("records", records);
		return "new_records";
	}
		
	@PostMapping("/saveRecords")
	public String saveRecords(@ModelAttribute("records") Records records) {
		// save records to database
		recordsService.saveRecords(records);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get records from the service
		Records records = recordsService.getRecordsById(id);
		
		// set records as a model attribute to pre-populate the form
		model.addAttribute("records", records);
		return "update_records";
	}
	
	@GetMapping("/deleteRecords/{id}")
	public String deleteRecords(@PathVariable (value = "id") long id) {
		
		// call delete records method 
		this.recordsService.deleteRecordsById(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		
		int pageSize = 50;
		
		model.addAttribute("records", new Records());
		
		Page<Records> page = recordsService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Records> listRecords = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listRecords", listRecords);
        
		return "index";
	}
	
    @GetMapping("/recordsSearch")
    public String recordsSearch(Model model) {
    	
        model.addAttribute("records", new Records());
        
    	String page = findPaginated(1, "title", "asc", model);
    	model.addAttribute("page", page);
    	
    	List<Records> listRecords = recordsRepository.findAll();
    	model.addAttribute("listRecords", listRecords);

        return "recordsSearch";
    }
    
    //for full-text search, you must alter table within MySQL and add index name "full_text_search_idx" with FULLTEXT as type
	
	@PostMapping("/recordsSearch")
	public String recordsSearch(@Param("keyword") String keyword, Model model) {
		
		List<Records> foundRecords = recordsService.search(keyword);
		
		model.addAttribute("keyword", keyword);
		model.addAttribute("foundRecords", foundRecords);
		
		return "recordsSearch";
	}
}