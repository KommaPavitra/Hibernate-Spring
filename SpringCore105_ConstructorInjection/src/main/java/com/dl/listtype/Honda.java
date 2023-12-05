package com.dl.listtype;

import java.util.Map;

public class Honda {

	private String sname;
	//private List<String> models;
	private Map<Integer,String> models;
	
	public Honda(String sname, Map<Integer, String> models) {
		super();
		this.sname = sname;
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [sname=" + sname + ", models=" + models + "]";
	}
	
	
	
	

}
