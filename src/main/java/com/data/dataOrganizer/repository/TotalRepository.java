package com.data.dataOrganizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.dataOrganizer.models.Total;

@Repository
public interface TotalRepository extends JpaRepository<Total, Long>{

}
