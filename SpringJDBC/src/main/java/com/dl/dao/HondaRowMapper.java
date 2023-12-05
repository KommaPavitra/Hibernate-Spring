package com.dl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dl.model.Honda;
//functional implementation only one method
public class HondaRowMapper implements RowMapper<Honda>{

	@Override
	public Honda mapRow(ResultSet rs, int rowNum) throws SQLException {
		Honda honda = new Honda();
		honda.setId(rs.getInt(1));
		honda.setBikeName(rs.getString(2));
		honda.setCc(rs.getDouble(4));
		honda.setBikeColor(rs.getString(3));
		return honda;
		
	}

}
