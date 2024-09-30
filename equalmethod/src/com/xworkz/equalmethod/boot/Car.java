package com.xworkz.equalmethod.boot;

public class Car {

	 public float carPrice;
	 public String carColor;
	 public String models;
	 public Boolean isItAffordablePrice;
	 public String brandName;
	 public Boolean isItNewCar;
	public double milage;
	 public int totalSeats;
	 public Boolean isCarSunroof;
	 public Boolean petrolOrDiselCar;
	public Car(float carPrice, String carColor, String models, Boolean isItAffordablePrice, String brandName,
			Boolean isItNewCar, double milage, int totalSeats, Boolean isCarSunroof, Boolean petrolOrDiselCar) {
		super();
		this.carPrice = carPrice;
		this.carColor = carColor;
		this.models = models;
		this.isItAffordablePrice = isItAffordablePrice;
		this.brandName = brandName;
		this.isItNewCar = isItNewCar;
		this.milage = milage;
		this.totalSeats = totalSeats;
		this.isCarSunroof = isCarSunroof;
		this.petrolOrDiselCar = petrolOrDiselCar;
	}
	 
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Car car=(Car) obj;
		 
		 return isItAffordablePrice.equals(car.isItAffordablePrice) && carPrice==car.carPrice && models.equals(car.models) && carColor.equals(car.carColor) && brandName.equals(car.brandName) && isItNewCar.equals(car.isItNewCar) && milage==car.milage && totalSeats==car.totalSeats && isCarSunroof.equals(car.isCarSunroof) && petrolOrDiselCar.equals(car.petrolOrDiselCar);
	 }


	 
}

