package com.dl;

public class Client {

	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.honda());
		
		Car car = new Car();
		System.out.println(car.honda());

	}

}
//no dependency injection
//objects created manually
//tightly coupled
//testing will be difficult
//dependency container  work 

