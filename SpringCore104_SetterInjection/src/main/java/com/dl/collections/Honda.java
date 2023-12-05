package com.dl.collections;

import java.util.Map;

public class Honda {
	private int vno;
	//private List<String> models;
	
   //private Set<String> models;
	private Map<Integer,String> models;

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public Map<Integer, String> getModels() {
		return models;
	}

	public void setModels(Map<Integer, String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [vno=" + vno + ", models=" + models + "]";
	}
	
	
}
 