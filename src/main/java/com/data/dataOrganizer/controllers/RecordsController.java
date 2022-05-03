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
	
//	@Autowired
//	private RecordsRepository recordsRepository;
	
	// display list of Records
	@GetMapping("/")
	//@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public String viewHomePage(Model model) {
		List<Records> listRecords = recordsService.getAllRecords();
		
		model.addAttribute("listRecords", listRecords);
		
		return "index";
		
		//return findPaginated(1, "name", "asc", model);		
	}
	
	@PostMapping("/")
	public String viewHomePage(@Param("keyword") String keyword, Model model) {
		
		List<Records> foundRecords = recordsService.search(keyword);
		
		model.addAttribute("keyword", keyword);
		model.addAttribute("foundRecords", foundRecords);
		
		return "index";
	}
	
	//@GetMapping("/showNewRecordsForm")
	@RequestMapping(value="/showNewRecordsForm", method = {RequestMethod.GET, RequestMethod.POST})
	public String showNewRecordsForm(Model model) {
		// create model attribute to bind form data
		Records Records = new Records();
		model.addAttribute("Records", Records);
		
		return "new_Records";
	}
		
	@PostMapping("/saveRecords")
	public String saveRecords(@ModelAttribute("Records") Records Records) {
		// save Records to database
		recordsService.saveRecords(Records);
		
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {	
		// get Records from the service
		Records Records = recordsService.getRecordsById(id);
		
		// set Records as a model attribute to pre-populate the form
		model.addAttribute("Records", Records);
		
		return "update_Records";
	}
	
	@GetMapping("/deleteRecords/{id}")
	public String deleteRecords(@PathVariable (value = "id") long id) {	
		// call delete Records method 
		this.recordsService.deleteRecordsById(id);
		
		return "redirect:/";
	}
	
	
//	@GetMapping("/page/{pageNo}")
//	@RequestMapping(value="/page/{pageNo}", method= {RequestMethod.GET, RequestMethod.POST})
//	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
//			@RequestParam("sortField") String sortField,
//			@RequestParam("sortDir") String sortDir,
//			Model model) {
//		
//		int pageSize = 50;
//		
//		model.addAttribute("Records", new Records());
//		
//		Page<Records> page = recordsService.findPaginated(pageNo, pageSize, sortField, sortDir);
//		List<Records> listRecords = page.getContent();
//		
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalItems", page.getTotalElements());
//		
//		model.addAttribute("sortField", sortField);
//		model.addAttribute("sortDir", sortDir);
//		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//		
//		model.addAttribute("listRecords", listRecords);
		
//		List<Records> foundRecords = recordsService.search(keyword);
//		
//		model.addAttribute("keyword", keyword);
//		model.addAttribute("foundRecords", foundRecords);
//        
//		return "index";
//	}
	
//	@PostMapping("/page/{pageNo}")
//	public String findPaginated(@Param("keyword") String keyword, Model model) {
//		
//		List<Records> foundRecords = recordsService.search(keyword);
//		
//		model.addAttribute("keyword", keyword);
//		model.addAttribute("foundRecords", foundRecords);
//        
//		return "index";
//	}
	
//    @GetMapping("/recordsSearch")
//    public String RecordsSearch(Model model) {
//    	
//      model.addAttribute("Records", new Records());
//        
////    	String page = findPaginated(1, "name", "asc", model);
////    	model.addAttribute("page", page);
////    	
//    	List<Records> listRecords = RecordsRepository.findAll();
//    	model.addAttribute("listRecords", listRecords);
//
//        return "recordsSearch";
//    }
//    
//    //for full-text search, you must alter table within MySQL and add index name "full_text_search_idx" with FULLTEXT as type
//	
//	@PostMapping("/recordsSearch")
//	public String RecordsSearch(@Param("keyword") String keyword, Model model) {
//		
//		List<Records> foundRecords = recordsService.search(keyword);
//		
//		model.addAttribute("keyword", keyword);
//		model.addAttribute("foundRecords", foundRecords);
//		
//		return "recordsSearch";
//	}
}