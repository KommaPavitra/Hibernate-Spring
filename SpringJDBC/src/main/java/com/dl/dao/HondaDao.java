package com.dl.dao;

import java.util.List;

import com.dl.model.Honda;

public interface HondaDao {
	
	//Abs Methods
		public int insertRecord(Honda honda);
		public int updateRecord(Honda honda);
		
		public int deleteRecord(int i);
		
		public List<Honda> listBikes();
		

}
