package com.example.hospital.ControllerEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.PatientDao;
import com.example.hospital.entitiy.Patient;

@RestController
public class PatientController {
	@Autowired
	private PatientDao pd;
	@RequestMapping("ptntInsrtd")
	public void patientInsrtdata(@RequestBody Patient p) {
		pd.save(p);
		
	}
	
	@RequestMapping("ptntInsrtdAll")
	public void patientInsrtdataAll(@RequestBody List<Patient>p1) {
		//pd.saveAll(p1);
		for (Patient patient : p1) {
			pd.save(patient);
			
		}
		
	}
	@RequestMapping("del2/{id}")
	public void delete(@PathVariable("id") Long id) {
		pd.deleteById(id);
	}

}
