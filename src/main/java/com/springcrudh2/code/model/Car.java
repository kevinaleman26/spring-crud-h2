package com.springcrudh2.code.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "maximum_speed")
	private Integer maximunSpeed;
	
	@Column(name = "engine")
	private Double engine;
	
	@Column(name = "features")
	private String features;
	
	@Column(name = "launch_date")
	private String launchDate;
	
	public Car() {

	}

	public Car(String brand, String model, Integer maximunSpeed, Double engine, String feature, String launchDate) {
		this.brand = brand;
		this.model = model;
		this.maximunSpeed = maximunSpeed;
		this.engine = engine;
		this.features = feature;
		this.launchDate = launchDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getMaximunSpeed() {
		return maximunSpeed;
	}

	public void setMaximunSpeed(Integer maximunSpeed) {
		this.maximunSpeed = maximunSpeed;
	}

	public Double getEngine() {
		return engine;
	}

	public void setEngine(Double engine) {
		this.engine = engine;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	
	

}
