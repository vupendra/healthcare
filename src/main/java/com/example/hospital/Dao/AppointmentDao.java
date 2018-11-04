package com.example.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.entitiy.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
