package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Complaints;
@Repository
public interface ComplaintsDao extends JpaRepository<Complaints, Long>{

}
