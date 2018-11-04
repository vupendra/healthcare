package com.example.hospital.entitiy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visiting")
public class Visiting {
	@Id
	@GeneratedValue
	private Long id;
	private Date datetime;
	
	@OneToOne
	@JoinColumn(name="apid")
	private Appointment apntmnt;
	@ManyToOne
	@JoinColumn(name="did")
	private Doctor doct;
	
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
	public Appointment getApntmnt() {
		return apntmnt;
	}
	public void setApntmnt(Appointment apntmnt) {
		this.apntmnt = apntmnt;
	}
	public Doctor getDoct() {
		return doct;
	}
	public void setDoct(Doctor doct) {
		this.doct = doct;
	}
	
	

}
