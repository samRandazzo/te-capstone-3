package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Weather;

public interface WeatherDAO {
	public List<Weather>getParkWeather(String parkcode);

}
