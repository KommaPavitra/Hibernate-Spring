package com.dl.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Honda {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bikeName;
	private String bikeColor;
	private Double cc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	public Double getCc() {
		return cc;
	}
	public void setCc(Double cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Honda [id=" + id + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + ", cc=" + cc + "]";
	}
	

}
