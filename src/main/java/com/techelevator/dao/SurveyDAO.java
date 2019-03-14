package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Survey;

public interface SurveyDAO {

	void createSurvey(Survey newSurvey);
	List<Survey> getAllResults();
}
