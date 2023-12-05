package com.dl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;
@Component("hondaDao")
public class HondaDaoImpl implements HondaDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertRecord(Honda honda) {
		String sql = "insert into honda values (?, ?, ?, ?)";
		int update = jdbcTemplate.update(sql, honda.getId(), honda.getBikeName(), honda.getBikeColor(), honda.getCc());
		
		return update;
	}

	@Override
	public int updateRecord(Honda honda) {
		String sql = "update honda set bikeName = ?, colorName = ?, cc = ? where id = ?";
		int update = jdbcTemplate.update(sql, honda.getBikeName(),  honda.getBikeColor(), honda.getCc(), honda.getId());
		return update;
	}

	@Override
	public int deleteRecord(int id) {
		String sql = "delete from honda where id = ?";
		int update = jdbcTemplate.update(sql, id);
		return update;
	}

	@Override
	public List<Honda> listBikes() {
		String s1 = "select * from Honda";
		List<Honda> query = jdbcTemplate.query(s1, new HondaRowMapper());
		
		return query;

	}

}