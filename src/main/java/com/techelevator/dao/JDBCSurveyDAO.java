package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Survey;

@Component
public class JDBCSurveyDAO implements SurveyDAO {

	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public JDBCSurveyDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createSurvey(Survey newSurvey) {
		String sqlInsert = "INSERT INTO survey_result (parkcode, emailaddress, state, activitylevel) VALUES (?,?,?,?);";
		jdbcTemplate.update(sqlInsert, newSurvey.getParkcode(), newSurvey.getEmailaddress(), newSurvey.getState(), newSurvey.getActivitylevel());
	}

	@Override
	public List<Survey> getAllResults() {
		List<Survey> surveyResults = new ArrayList<Survey>();
		String sqlQueryString = "SELECT * FROM survey_result;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlQueryString);
		Survey aSurvey;
		while (results.next()) {
			aSurvey = mapRowToSurvey(results);
			surveyResults.add(aSurvey);
		}
		return surveyResults;
	}

	private Survey mapRowToSurvey(SqlRowSet results) {
		Survey aSurvey = new Survey();
		aSurvey.setParkcode(results.getString("parkcode"));
		aSurvey.setEmailaddress(results.getString("emailaddress"));
		aSurvey.setState(results.getString("state"));
		aSurvey.setActivitylevel(results.getString("activitylevel"));
		return aSurvey;

	}
	
}
