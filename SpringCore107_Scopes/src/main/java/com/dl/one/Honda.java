package com.dl.one;

public class Honda {

	private int vno;
	private String vnames;
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVnames() {
		return vnames;
	}
	public void setVnames(String vnames) {
		this.vnames = vnames;
	}
	
	@Override
	public String toString() {
		return "Honda [vno=" + vno + ", vnames=" + vnames + "]";
	}
	

}
