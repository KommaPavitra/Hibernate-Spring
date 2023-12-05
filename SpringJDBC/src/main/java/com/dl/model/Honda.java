package com.dl.model;

public class Honda {
	//create table honda(id int, bikeName varchar(25), colorName varchar(20), cc double);
		//properties
		private int id;
		private String bikeName;
		private String bikeColor;
		private double cc;
		
		//setters and getters
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
		public double getCc() {
			return cc;
		}
		public void setCc(double cc) {
			this.cc = cc;
		}
		
		@Override
		public String toString() {
			return "Honda [id=" + id + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + ", cc=" + cc + "]";
		}
		

}
