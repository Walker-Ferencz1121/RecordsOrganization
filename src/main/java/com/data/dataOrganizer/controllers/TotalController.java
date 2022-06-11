package com.data.dataOrganizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.data.dataOrganizer.models.Total;
import com.data.dataOrganizer.services.TotalService;

@Controller
public class TotalController {

	@Autowired
	private TotalService totalService;
		
	@GetMapping("/totalTable")
	public String totalTable(double totalPrice, Model model) {
		List<Total> totalList = totalService.getList();
		Total total = new Total();
		
		total.setTotalPrice(totalPrice);
		
		model.addAttribute("totalList", totalList);

		return "/total/total_table";
	}
	
	@GetMapping("/newTotal")
	public String newTotal(Model model) {
		// create model attribute to bind form data
		Total total = new Total();
		
		model.addAttribute("total", total);
		
		return "/total/new_total";
	}
	
	@PostMapping("/saveTotal")
	public String saveTotal(@ModelAttribute("total") Total total) {
		// save total to database
		totalService.saveTotal(total);
		
		return "redirect:/totalTable";
	}
	
	@GetMapping("/updateTotal/{id}")
	public String updateTotal(@PathVariable (value = "id") long id, Model model) {
		// get total from the service
		Total total = totalService.getTotalById(id);
		
		// set total as a model attribute to pre-populate the form
		model.addAttribute("total", total);
		return "/total/update_total";
	}
	
	@GetMapping("/deleteTotal/{id}")
	public String deleteTotal(@PathVariable (value = "id") long id) {
		// call delete total method 
		this.totalService.deleteTotalById(id);
		return "redirect:/totalTable";
	}
}
