package com.techelevator.dao;

import java.util.HashMap;
import java.util.Map;

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
	public Map<String, Integer> getFavoritePark() {
		Map<String, Integer> favoritePark = new HashMap<String, Integer>();
		String sqlQuery = "SELECT parkcode, COUNT(parkcode) AS parkcount FROM survey_result GROUP BY parkcode ORDER BY parkcount DESC LIMIT 25;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlQuery);
		while(results.next()) {
			favoritePark.put(results.getString("parkcode"), results.getInt("parkcount"));
		}
		return favoritePark;
	}
	
}
