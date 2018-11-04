package com.example.hospital.ControllerEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.DoctorDao;
import com.example.hospital.entitiy.Doctor;

@RestController
public class DoctorControlller {
	@Autowired
	private DoctorDao dd;

	@RequestMapping("saveddata")
	public void Saveddata(@RequestBody Doctor d) {
		dd.save(d);
	}

	@RequestMapping("saveddataAll")
	public void SaveddataAll(@RequestBody List<Doctor> d1) {
		dd.saveAll(d1);
	}
	@RequestMapping("dell/{id}")
	public void delete(@PathVariable("id") Integer id) {
		dd.deleteById(id);
	}
}
