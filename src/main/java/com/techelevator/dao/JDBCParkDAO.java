package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Park;

@Component
public class JDBCParkDAO implements ParkDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCParkDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Park> getAllParks() {

		List<Park> parks = new ArrayList<Park>();
		String sqlQueryString = "SELECT * FROM park;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlQueryString);
		Park thePark;
		while (results.next()) {
			thePark = mapRowToPark(results);
			parks.add(thePark);
		}

		return parks;
	}

	private Park mapRowToPark(SqlRowSet results) {
		Park thePark = new Park();
		thePark.setParkcode(results.getString("parkcode"));
		thePark.setParkname(results.getString("parkname"));
		thePark.setState(results.getString("state"));
		thePark.setAcreage(results.getInt("acreage"));
		thePark.setElevationinfeet(results.getInt("elevationinfeet"));
		thePark.setMilesoftrail(results.getDouble("milesoftrail"));
		thePark.setNumberofcampsites(results.getInt("numberofcampsites"));
		thePark.setClimate(results.getString("climate"));
		thePark.setYearfounded(results.getInt("yearfounded"));
		thePark.setAnnualvisitorcount(results.getInt("annualvisitorcount"));
		thePark.setInspirationalquote(results.getString("inspirationalquote"));
		thePark.setInspirationalquotesource(results.getString("inspirationalquotesource"));
		thePark.setParkdescription(results.getString("parkdescription"));
		thePark.setEntryfee(results.getInt("entryfee"));
		thePark.setNumberofanimalspecies(results.getInt("numberofanimalspecies"));
		return thePark;

	}

}
