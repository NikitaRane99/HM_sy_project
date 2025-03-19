package com.example.demo.Hms.docLogin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Hms.docLogin.entity.Appointment;

@Repository
public interface AppointmentRespo extends  JpaRepository<Appointment ,Long> {

	
		
	}


