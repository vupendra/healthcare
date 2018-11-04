package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer> {

}
