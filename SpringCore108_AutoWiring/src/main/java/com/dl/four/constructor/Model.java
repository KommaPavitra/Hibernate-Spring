package com.dl.four.constructor;

public class Model {
	private String models;
	private String type;
	
	public String getModels() {
		return models;
	}
	public void setModels(String models) {
		this.models = models;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Model [models=" + models + ", type=" + type + "]";
	}
  public Model() {
	// TODO Auto-generated constructor stub
}
public Model(String models, String type) {
	super();
	this.models = models;
	this.type = type;
}
  
  
}
