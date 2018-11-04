package com.example.hospital.ControllerEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.VisitingDao;
import com.example.hospital.entitiy.Visiting;
@RestController
@RequestMapping("visitinginserted")
public class VisitingController {
	@Autowired
	private VisitingDao vd;
	@PostMapping
	public void saveVisiting(@RequestBody Visiting v) {
		vd.save(v);
	}

}
