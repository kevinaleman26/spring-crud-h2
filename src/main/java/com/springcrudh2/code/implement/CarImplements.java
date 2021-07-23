package com.springcrudh2.code.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrudh2.code.interfaces.CarRepo;
import com.springcrudh2.code.interfaces.ICarImplements;
import com.springcrudh2.code.model.Car;

@Service
public class CarImplements implements ICarImplements{

	@Autowired
	private CarRepo CarRepository;


	@Override
	public List<Car> carList() {
		List<Car> Cars = new ArrayList<Car>();
		CarRepository.findAll().forEach(Cars::add);
		return Cars;
	}

	@Override
	public Optional<Car> getCar(long id) {
		Optional<Car> CarData = CarRepository.findById(id);
		return CarData;
	}

	@Override
	public Car saveCar(Car body) {
		return CarRepository.save(new Car(body.getBrand(), body.getModel(), body.getMaximunSpeed(), body.getEngine(), body.getFeatures(), body.getLaunchDate()));
	}

	@Override
	public Car updateCar(long id, Car body) {
		
		Optional<Car> CarData = CarRepository.findById(id);

		if (CarData.isPresent()) {
			Car _Car = CarData.get();
			_Car.setBrand(body.getBrand());
			_Car.setEngine(body.getEngine());
			_Car.setFeatures(body.getFeatures());
			_Car.setLaunchDate(body.getLaunchDate());
			_Car.setMaximunSpeed(body.getMaximunSpeed());
			_Car.setModel(body.getModel());
			
			return CarRepository.save(_Car);
		} else {
			return null;
		}
	}

	@Override
	public void deleteCar(long id) {
		CarRepository.deleteById(id);
	}
}
