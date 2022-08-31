package com.ElectronicApplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ElectronicApplication.Entity.ElectronicDetails;

@Service

public interface ElectronicService {
	public ElectronicDetails createEle(ElectronicDetails ele);
	public List<ElectronicDetails> getAllElectronics();
	public ElectronicDetails getElectronicsId(int id,ElectronicDetails ele);

}
