package com.dl.component;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Honda {
     public Honda() {
		
	}

	private List<String> models;

	public Honda(List<String> models) {
		this.models = models;
	}

	public List<String> getModels() {
		return models;
	}

	public void setModels(List<String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
	

}
