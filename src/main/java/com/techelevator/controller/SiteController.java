package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.dao.ParkDAO;
import com.techelevator.model.Park;

@Controller
public class SiteController {

	@Autowired
	private ParkDAO parkDAO;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHomepage(ModelMap modelMap) {
		List<Park> parks = parkDAO.getAllParks();
		modelMap.addAttribute("parks", parks);
		
		return "homepage";
	}
	
	
	
}
