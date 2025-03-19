package com.example.demo.Hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Hms.entity.Patient;

@Repository
public interface Patientrepo extends JpaRepository<Patient, Integer>{
	

}
