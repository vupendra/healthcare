package com.example.hospital.ControllerEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.AppointmentDao;
import com.example.hospital.entitiy.Appointment;

@RestController
public class AppointmentContoller {
	@Autowired
	private AppointmentDao ad;

	@RequestMapping("appnmtInsert")
	public void saveAppointment(@RequestBody Appointment a) {
		ad.save(a);
	}

}
