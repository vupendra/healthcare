package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {
	
	

}
