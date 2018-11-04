package com.example.hospital.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicaion")
public class Medication {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="mid")
	
	private Medicine medc;
	private String howtouse;
	private Integer quanty;	
	private Integer duration;
	@ManyToOne
	@JoinColumn(name="cid")
	private Complaints comp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Medicine getMedc() {
		return medc;
	}
	public void setMedc(Medicine medc) {
		this.medc = medc;
	}
	public String getHowtouse() {
		return howtouse;
	}
	public void setHowtouse(String howtouse) {
		this.howtouse = howtouse;
	}
	public Integer getQuanty() {
		return quanty;
	}
	public void setQuanty(Integer quanty) {
		this.quanty = quanty;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Complaints getComp() {
		return comp;
	}
	public void setComp(Complaints comp) {
		this.comp = comp;
	}
	
	
	
	

}
