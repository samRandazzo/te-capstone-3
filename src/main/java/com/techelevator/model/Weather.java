package com.techelevator.model;

public class Weather {

	private long parkcode;
	private int fivedayforecastvalue;
	private int low;
	private int high;
	private String forecast;

	public long getParkcode() {
		return parkcode;
	}

	public void setParkcode(long parkcode) {
		this.parkcode = parkcode;
	}

	public int getFivedayforecastvalue() {
		return fivedayforecastvalue;
	}

	public void setFivedayforecastvalue(int fivedayforecastvalue) {
		this.fivedayforecastvalue = fivedayforecastvalue;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public String getForecast() {
		return forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

}
