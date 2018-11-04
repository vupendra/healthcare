package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer> {

}
