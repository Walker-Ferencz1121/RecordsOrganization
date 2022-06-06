package com.data.dataOrganizer.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.data.dataOrganizer.models.Total;
import com.data.dataOrganizer.repository.TotalRepository;

@Controller
public class TotalController {

	private TotalRepository totalRepository;
	
	@GetMapping("/totalPrice")
	public String totalCalculation(Model model) {
		List<Total> totalList = totalRepository.findAll();
				
		model.addAttribute("totalList", totalList);
		model.addAttribute("Total", new Total());
		
		return "total_table";
	}
	
	@PostMapping("/addition")
	public String addForm(@ModelAttribute Total total, BindingResult result, Model model) {
//		model.addAttribute("addition", addition);
		model.addAttribute("total", total);
		return "total_calculation";
	}
}
