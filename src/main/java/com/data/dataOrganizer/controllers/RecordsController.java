package com.data.dataOrganizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.data.dataOrganizer.models.Records;
import com.data.dataOrganizer.services.RecordsService;

@Controller
public class RecordsController {

	@Autowired
	private RecordsService recordsService;
		
	// display list of records
//	@GetMapping("/")
//	public String viewHomePage(Model model) {
//		return findPaginated(1, "firstName", "asc", model);		
//	}
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Records> listRecords = recordsService.getAllRecords();
		
		model.addAttribute("listRecords", listRecords);
		
		return "index";
	}
	
	//For full text search through MySQL, go to indexes and type in full_text_search_idx and select FULLTEXT followed by the categories you would like to search by
	@PostMapping("/")
	public String viewHomePage(@Param("keyword") String keyword, Model model) {
		List<Records> foundRecords = recordsService.search(keyword);
		
		model.addAttribute("keyword", keyword);
		model.addAttribute("foundRecords", foundRecords);
		
		return "index";
	}
	
	@GetMapping("/newRecord")
	public String newRecord(Model model) {
		// create model attribute to bind form data
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
	
	@GetMapping("/updateRecord/{id}")
	public String updateRecord(@PathVariable (value = "id") long id, Model model) {
		// get records from the service
		Records records = recordsService.getRecordsById(id);
		
		// set records as a model attribute to pre-populate the form
		model.addAttribute("records", records);
		return "update_records";
	}
	
	@GetMapping("/extraInfo/{id}")
	public String extraInfoRecords(@PathVariable (value = "id") long id, Model model) {	
		Records records = recordsService.getRecordsById(id);
				
		model.addAttribute("records", records);
		
		return "extra_info";
	}
	
	@GetMapping("/deleteRecord/{id}")
	public String deleteRecord(@PathVariable (value = "id") long id) {
		// call delete records method 
		this.recordsService.deleteRecordsById(id);
		return "redirect:/";
	}
	
//	@GetMapping("/page/{pageNo}")
//	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
//			@RequestParam("sortField") String sortField,
//			@RequestParam("sortDir") String sortDir,
//			Model model) {
//		int pageSize = 5;
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
//		return "index";
//	}
}