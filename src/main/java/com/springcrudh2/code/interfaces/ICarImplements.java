package com.springcrudh2.code.interfaces;

import java.util.List;
import java.util.Optional;

import com.springcrudh2.code.model.Car;


public interface ICarImplements {

	List<Car> carList();
	
	Optional<Car> getCar(long id);
	
	Car saveCar(Car body);
	
	Car updateCar(long id, Car body);
	
	void deleteCar(long id);
}
