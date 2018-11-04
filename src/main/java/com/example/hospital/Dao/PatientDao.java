package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>
{

	
}
