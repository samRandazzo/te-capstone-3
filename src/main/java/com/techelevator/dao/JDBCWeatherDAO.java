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
		List<Weather> theWeather = new ArrayList<Weather>();
		String  sqlSelectWeather = "SELECT * " + 
								   "FROM weather " +
<<<<<<< HEAD
								   "WHERE parkcode = ?;";
								   
=======
								   "WHERE parkcode = ? ;";
//								   "ORDER BY fivedayforecastvalue ASC;";
>>>>>>> 203d0fc62bf1e34616be7a7712bbdbb862b2af98
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeather, parkcode);
		while(results.next()) {							
			Weather weather = new Weather();
			weather.setParkcode(results.getString("parkcode"));
			weather.setFivedayforecastvalue(results.getInt("fivedayforecastvalue"));
			weather.setLow(results.getInt("low"));
			weather.setHigh(results.getInt("high"));
			weather.setForecast(results.getString("forecast"));
			theWeather.add(weather);
		}
				
		return theWeather;
	}
	
	

}
