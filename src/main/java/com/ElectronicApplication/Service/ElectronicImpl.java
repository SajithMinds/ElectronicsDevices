package com.ElectronicApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ElectronicApplication.Entity.ElectronicDetails;
import com.ElectronicApplication.Exception.ElectronicNotFoundException;
import com.ElectronicApplication.Repository.ElectronicRepository;

@Component
public class ElectronicImpl {
	@Autowired
	ElectronicRepository repos;
	public ElectronicDetails createEle(ElectronicDetails ele) {
		return repos.save(ele);
	}


	public List<ElectronicDetails> getAllElectronics() {
		List<ElectronicDetails> list = (List<ElectronicDetails>) repos.findAll();
		return list;
	}

	public ElectronicDetails getElectronicsId(int id, ElectronicDetails ele) {
		return repos.findById(id).orElseThrow(()->new ElectronicNotFoundException("Electronics id not found with id :"+ele.getId()));
		
	}
}
