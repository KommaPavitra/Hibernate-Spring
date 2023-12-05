package com.dl.ref;

public class Models {
	private String carName;
	private Double cost;
	private String generation;
	private String type;
	
	public Models(String carName, Double cost, String generation, String type) {
		super();
		this.carName = carName;
		this.cost = cost;
		this.generation = generation;
		this.type = type;
	}
	
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	


	@Override
	public String toString() {
		return "Models [carName=" + carName + ", cost=" + cost + ", generation=" + generation + ", type=" + type + "]";
	}

	
}
