package com.techelevator.dao;

import java.util.List;
import java.util.Map;

import com.techelevator.model.Survey;

public interface SurveyDAO {

	void createSurvey(Survey newSurvey);
	Map<String, Integer> getFavoritePark();
}
