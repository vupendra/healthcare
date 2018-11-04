package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Visiting;
@Repository
public interface VisitingDao extends JpaRepository<Visiting, Long> {

}
