package com.example.hospital.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disease")
public class Disease {
	@Id
	@GeneratedValue
private Long id;
private String descrip;
private String name;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescrip() {
	return descrip;
}
public void setDescrip(String descrip) {
	this.descrip = descrip;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
