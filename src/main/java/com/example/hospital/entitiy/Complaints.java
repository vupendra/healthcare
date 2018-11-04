package com.example.hospital.entitiy;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="complaints")
public class Complaints {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany
	@JoinTable(name="complaints_diseases",joinColumns= {@JoinColumn (name="cid")},
	inverseJoinColumns = {@JoinColumn(name="deid")})
	private List<Disease>disease;
	private String description;
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting visits;
	
	@OneToMany(mappedBy="comp" ,cascade=CascadeType.ALL)
	//here  the data complaaints and dieseae and medication by itself simulteanously saved
	
	private List<Medication>med;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Visiting getVisits() {
		return visits;
	}
	public void setVisits(Visiting visits) {
		this.visits = visits;
	}
	public List<Medication> getMed() {
		return med;
	}
	public void setMed(List<Medication> med) {
		this.med = med;
	}
	
	
	

}
