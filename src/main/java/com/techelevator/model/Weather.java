package com.techelevator.model;

public class Weather {

	private String parkcode;
	private int fivedayforecastvalue;
	private int low;
	private int high;
	private String forecast;
	private String message;

	public String getParkcode() {
		return parkcode;
	}	

	public void setParkcode(String parkcode) {
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

	public String getWeatherMessage() {

		if (forecast.equalsIgnoreCase("snow")) {
			if (high < 20 || low < 20) {
				message = "Pack snowshoes and beware exposure to frigid temperatures.";
			} else if (high - low > 20) {
				message = "Pack snowshoes and wear breathable layers.";
			} else if ((high - low > 20) && high > 75) {
				message = "Pack snowshoes,wear breathable layers and bring an extra gallon of water.";
			} else if (high > 75) {
				message = "Pack snowshoes and bring an extra gallon of water.";
			} else {
				message = "Pack snowshoes";
			}
		} else if (forecast.equalsIgnoreCase("rain")) {
			if (high < 20 || low < 20) {
				message = "Pack rain gear and waterproof shoes. Beware of exposure to frigid temperatures.";
			} else if (high - low > 20) {
				message = "Pack rain gear and waterproof shoes. Wear breathable layers.";
			} else if ((high - low > 20) && high > 75) {
				message = "Pack rain gear,waterproof shoes, wear breathable layers and bring an extra gallon of water.";
			} else if (high > 75) {
				message = "Pack rain gear,waterproof shoes and bring an extra gallon of water.";
			} else {
				message = "Pack rain gear and waterproof shoes.";
			}
		} else if (forecast.equalsIgnoreCase("thunderstorms")) {
			if (high < 20 || low < 20) {
				message = "Seek shelter and avoid hiking on exposed ridges. Beware of exposure to frigid temperatures.";
			} else if (high - low > 20) {
				message = "Seek shelter and avoid hiking on exposed ridges. Wear breathable layers.";
			} else if ((high - low > 20) && high > 75) {
				message = "Seek shelter and avoid hiking on exposed ridges. Wear breathble layers and bring an extra gallon of water.";
			} else if (high > 75) {
				message = "Seek shelter and avoid hiking on exposed ridges. Bring an extra gallon of water.";
			} else {
				message = "Seek shelter and avoid hiking on exposed ridges";
			}
		} else if (forecast.equalsIgnoreCase("sunny")) {
			if (high < 20 || low < 20) {
				message = "Pack sunblock. Beware of exposure to frigid temperatures.";
			} else if (high - low > 20) {
				message = "Pack sunblock	. Wear breathable layers.";
			} else if ((high - low > 20) && high > 75) {
				message = "Pack sunblock, wear breathable layers and bring an extra gallon of water.";
			} else if (high > 75) {
				message = "Pack sunblock and bring an extra gallon of water.";
			} else {
				message = "Pack sunblock";
			}
		} else {
			if (high < 20 || low < 20) {
				message = "Beware of exposure to frigid temperatures.";
			} else if (high - low > 20) {
				message = "Wear breathable layers.";
			} else if ((high - low > 20) && high > 75) {
				message = "Wear breathable layers and bring an extra gallon of water.";
			} else if (high > 75) {
				message = "Bring an extra gallon of water.";
			}
		}

		return message;
	}

	public String getParsedForecast() {
		String parsedForecast = forecast.replaceAll("\\s","");
		return parsedForecast;
	}

	
}
