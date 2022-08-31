package com.ElectronicApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ElectronicApplication.Entity.ElectronicDetails;

public interface ElectronicRepository extends JpaRepository<ElectronicDetails, Integer>{

}
