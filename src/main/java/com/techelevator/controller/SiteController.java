package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.dao.ParkDAO;
import com.techelevator.dao.SurveyDAO;
import com.techelevator.model.Park;
import com.techelevator.model.Survey;

@Controller
public class SiteController {

	@Autowired
	private ParkDAO parkDAO;
	
	@Autowired
	private SurveyDAO surveyDAO;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHomepage(ModelMap modelMap) {
		List<Park> parks = parkDAO.getAllParks();
		modelMap.addAttribute("parks", parks);
		
		return "homepage";
	}
	
	@RequestMapping(path="/parkdetail", method=RequestMethod.GET)
	public String displayDetails(@RequestParam String parkcode, ModelMap modelMap) {
		Park park = parkDAO.getParkByParkCode(parkcode);
		modelMap.addAttribute("park", park);
		return "parkdetail";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.GET)
	public String displaySurvey() {
		return "survey";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String submitSurvey(@ModelAttribute Survey newSurvey, RedirectAttributes flashScope) {
		flashScope.addFlashAttribute("survey", newSurvey);
		surveyDAO.createSurvey(newSurvey);
		return "redirect:surveyResult";
	}
	
	@RequestMapping(path="/surveyResult", method=RequestMethod.GET)
	public String showAllResults(ModelMap modelHolder) {
		List<Survey> surveyResults= surveyDAO.getAllResults();
		modelHolder.put("surveyResults", surveyResults);
		
		
		return "surveyResult";
	}
	
}
