package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.dao.ParkDAO;
import com.techelevator.dao.WeatherDAO;
import com.techelevator.model.Weather;

@SessionAttributes
@Controller
public class WeatherController {
	
	private WeatherDAO weatherDao;
	private ParkDAO parkDao;
	private boolean celsius;
	
	@Autowired
	public WeatherController(WeatherDAO weatherDao, ParkDAO parkDao) {
		this.weatherDao = weatherDao;
		this.parkDao = parkDao;
	}
	
	@RequestMapping(path="/fivedayforecast", method= RequestMethod.GET)
	public String displayFiveDayForecast(@RequestParam String parkcode, @RequestParam int fivedayforcastvalue, ModelMap model){
		List<Weather> fivedayforecast = weatherDao.getParkWeather(parkcode);
		model.addAttribute("fivedayforecast", fivedayforecast);
		return "fivedayforecast";
	}
}
