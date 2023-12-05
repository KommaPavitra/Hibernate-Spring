package com.dl.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Honda {
	@Autowired
	@Qualifier("model")
	private Models models;

	public Models getModels() {
		return models;
	}

	public void setModels(Models models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}

	public Honda(Models models) {
		super();
		this.models = models;
	}
   public Honda() {
	// TODO Auto-generated constructor stub
}
}
