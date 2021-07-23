package com.springcrudh2.code.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrudh2.code.model.Car;

public interface  CarRepo extends JpaRepository<Car, Long>{
	
	List<Car> findByBrand(String brand);

	List<Car> findByModel(String model);
	
	List<Car> findByEngine(Double engine);

}
