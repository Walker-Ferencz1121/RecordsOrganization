package com.data.dataOrganizer.services;

import java.util.List;

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
}
