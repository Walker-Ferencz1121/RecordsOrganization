package com.data.dataOrganizer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.data.dataOrganizer.models.Records;
import com.data.dataOrganizer.repository.RecordsRepository;

@Service
public class RecordsService {

	@Autowired
	private RecordsRepository recordsRepository;

	public List<Records> getAllRecords() {
		return recordsRepository.findAll();
	}

	public void saveRecords(Records records) {
		this.recordsRepository.save(records);
	}

	public Records getRecordsById(long id) {
		Optional<Records> optional = recordsRepository.findById(id);
		Records records = null;
		if (optional.isPresent()) {
			records = optional.get();
		} else {
			throw new RuntimeException(" Records not found for id :: " + id);
		}
		return records;
	}

	public void deleteRecordsById(long id) {
		this.recordsRepository.deleteById(id);
	}

	public Page<Records> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.recordsRepository.findAll(pageable);
	}
}