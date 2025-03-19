package com.example.demo.Hms.docLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Hms.docLogin.entity.Billing;



@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
 

}
