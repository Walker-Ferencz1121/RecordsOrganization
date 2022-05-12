package com.data.dataOrganizer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.dataOrganizer.models.Records;

@Repository
public interface RecordsRepository extends JpaRepository<Records, Long>{

	@Query(value = "SELECT * FROM records WHERE MATCH(name) AGAINST(?1)", nativeQuery = true)
	List<Records> search(String keyword);
}