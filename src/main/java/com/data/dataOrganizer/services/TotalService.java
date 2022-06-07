package com.data.dataOrganizer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.dataOrganizer.models.Total;
import com.data.dataOrganizer.repository.TotalRepository;

@Service
public class TotalService {

	@Autowired
	private TotalRepository totalRepository;

	public List<Total> getList() {
		return totalRepository.findAll();
	}

	public void saveTotal(Total total) {
		this.totalRepository.save(total);
	}

	public Total getTotalById(long id) {
		Optional<Total> optional = totalRepository.findById(id);
		Total total = null;
		if (optional.isPresent()) {
			total = optional.get();
		} else {
			throw new RuntimeException(" Total not found for id :: " + id);
		}
		return total;
	}

	public void deleteTotalById(long id) {
		this.totalRepository.deleteById(id);
	}
}