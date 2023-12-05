package com.dl.four.constructor;

public class Honda {
	private Model models;
	
	public Model getModels() {
		return models;
	}

	public void setModels(Model models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}

  public Honda() {
	// TODO Auto-generated constructor stub
}

public Honda(Model models) {
	super();
	this.models = models;
}
  
  
}
