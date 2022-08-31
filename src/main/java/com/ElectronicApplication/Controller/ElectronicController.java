package com.ElectronicApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ElectronicApplication.Entity.ElectronicDetails;
import com.ElectronicApplication.Exception.ElectronicNotFoundException;
import com.ElectronicApplication.Service.ElectronicImpl;

@RestController
@RequestMapping("/Ele")
public class ElectronicController {
	@Autowired
	ElectronicImpl service;
	@PostMapping("/save")
	public ElectronicDetails save(@RequestBody ElectronicDetails ele) {
		return service.createEle(ele);
	}

	@GetMapping("/list")
	public List<ElectronicDetails> getAllElectronics(){
	return service.getAllElectronics();
	}
	@GetMapping("/list/{id}")
	public ElectronicDetails getElectronicsId(@PathVariable int id,  @RequestBody ElectronicDetails ele) throws ElectronicNotFoundException {
	return service.getElectronicsId(id, ele);
}
}
