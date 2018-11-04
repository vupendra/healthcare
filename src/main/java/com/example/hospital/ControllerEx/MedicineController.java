package com.example.hospital.ControllerEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dao.MedicineDao;
import com.example.hospital.entitiy.Medicine;
@RestController
public class MedicineController {
	@Autowired
	private MedicineDao md;
	@RequestMapping("medinfo")
	public void medinfo(@RequestBody Medicine m) {
		md.save(m);
	}
	@RequestMapping("medinfoAll")
	public void medinfoAll(@RequestBody List<Medicine> m1) {
		md.saveAll(m1);
	}
	@RequestMapping("del1/{id}")
	public void delete(@PathVariable("id") Integer id) {
		md.deleteById(id);
	}

}
