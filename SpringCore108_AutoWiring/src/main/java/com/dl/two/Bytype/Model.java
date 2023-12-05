package com.dl.two.Bytype;

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

}
