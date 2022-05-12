package com.data.dataOrganizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.dataOrganizer.models.Records;

@Repository
public interface RecordsRepository extends JpaRepository<Records, Long>{

}