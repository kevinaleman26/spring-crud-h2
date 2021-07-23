package com.springcrudh2.code.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudh2.code.interfaces.ICarImplements;
import com.springcrudh2.code.model.Car;

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	private ICarImplements impl;
	
	@GetMapping("/car")
	public ResponseEntity<List<Car>> getAllCars() {
		try {
			List<Car> Cars = impl.carList();

			if (Cars.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(Cars, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/car/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable("id") long id) {
		
		Optional<Car> CarData = impl.getCar(id);

		if (CarData.isPresent()) {
			return new ResponseEntity<>(CarData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/car")
	public ResponseEntity<Car> createCar(@RequestBody Car body) {
		try {
			return new ResponseEntity<>(impl.saveCar(body), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/car/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable("id") long id, @RequestBody Car body) {
		
		Car car = impl.updateCar(id, body);
		
		if (car != null) {
			return new ResponseEntity<>(car, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/car/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		try {
			impl.deleteCar(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
