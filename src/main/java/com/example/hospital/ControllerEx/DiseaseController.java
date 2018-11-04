package com.example.hospital.ControllerEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.DiseaseDao;
import com.example.hospital.entitiy.Disease;

@RestController
public class DiseaseController {
	@Autowired
private DiseaseDao dd;	

@RequestMapping	("disesinfo")
public void disesinfo(@RequestBody Disease d ) {
	dd.save(d);
}

@RequestMapping	("disesinfoAll")
public void disesinfoAll(@RequestBody List<Disease>d1 ) {
	dd.saveAll(d1);
}
@RequestMapping("del/{id}")
public void delete(@PathVariable("id") Integer id) {
	dd.deleteById(id);
}
}