package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Weather;

@Component
public class JDBCWeatherDAO implements WeatherDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCWeatherDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Weather> getParkWeather(String parkcode) {
		List<Weather> forcast = new ArrayList<Weather>();
		String  sqlSelectWeather = "SELECT * " + 
								   "FROM weather " +
								   "WHERE parkcode = ? " +
								   "ORDER BY fivedayforcastvalue ASC;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeather, parkcode);
		while(results.next()) {							
			
		}
				
		return forcast;
	}

}
