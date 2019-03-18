package com.techelevator.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey {

	private long surveyid;
	private String parkcode;
	@NotBlank(message="Email is required") @Email(message="Not a valid Email address")
	private String emailaddress;
	private String state;
	@NotNull(message="Please select an activity level")
	private String activitylevel;

	public long getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(long surveyid) {
		this.surveyid = surveyid;
	}

	public String getParkcode() {
		return parkcode;
	}

	public void setParkcode(String parkcode) {
		this.parkcode = parkcode;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActivitylevel() {
		return activitylevel;
	}

	public void setActivitylevel(String activitylevel) {
		this.activitylevel = activitylevel;
	}

}
