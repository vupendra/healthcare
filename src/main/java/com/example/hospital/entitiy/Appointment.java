package com.example.hospital.entitiy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue
	private Long id;
	private Date datetime;
	private String primaryreason;
	@ManyToOne
	@JoinColumn(name="fkpid")
	private Patient patient;
	
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getPrimaryreason() {
		return primaryreason;
	}
	public void setPrimaryreason(String primaryreason) {
		this.primaryreason = primaryreason;
	}
	
	
	

}
