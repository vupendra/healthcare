package com.example.hospital.ControllerEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospital.Dao.ComplaintsDao;
import com.example.hospital.entitiy.Complaints;
import com.example.hospital.entitiy.Medication;

@RestController
@RequestMapping("complaint")
public class ComplaintsController {
	@Autowired
	private ComplaintsDao cd;
	
	@PostMapping
	public void saveComplaints(@RequestBody Complaints c) {
		List<Medication> md=c.getMed();
		for (Medication medication : md) {
			medication.setComp(c);
		}
		cd.save(c);
		
		
	}
	@PostMapping("/all")
	public void saveAllComplaints(@RequestBody List<Complaints>ca) {
		for (Complaints complaints : ca) {
			List<Medication> md=complaints.getMed();
			for (Medication medication : md) {
				medication.setComp(complaints);
			}
		}
		
		cd.saveAll(ca);
		
		
	}
	

}
