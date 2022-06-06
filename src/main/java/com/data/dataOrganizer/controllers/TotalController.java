package com.data.dataOrganizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.data.dataOrganizer.models.Total;
import com.data.dataOrganizer.services.TotalService;

@Controller
public class TotalController {

	@Autowired
	private TotalService totalService;
	
	@GetMapping("/totalTable")
	public String totalTable(Model model) {
		List<Total> totalList = totalService.getList();

		model.addAttribute("totalList", totalList);

		return "/total/total_table";
	}
	
	@GetMapping("/totalPrice")
	public String totalCalculation(Model model) {
		model.addAttribute("Total", new Total());
		
		return "/total/total_calculation";
	}
	
	@PostMapping("/addition")
	public String addForm(@ModelAttribute Total total, BindingResult result, Model model) {
		model.addAttribute("total", total);
		
		return "/total/total_answer";
	}
}
