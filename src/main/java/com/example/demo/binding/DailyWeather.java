package com.example.demo.binding;

public class DailyWeather {
	
    private String dayName;
    private double tempHighCelsius;
    private String forecastBlurp;
    
    
	public DailyWeather(String dayName, double tempHighCelsius, String forecastBlurp) {
		super();
		this.dayName = dayName;
		this.tempHighCelsius = tempHighCelsius;
		this.forecastBlurp = forecastBlurp;
	}


	public String getDayName() {
		return dayName;
	}


	public void setDayName(String dayName) {
		this.dayName = dayName;
	}


	public double getTempHighCelsius() {
		return tempHighCelsius;
	}


	public void setTempHighCelsius(double tempHighCelsius) {
		this.tempHighCelsius = tempHighCelsius;
	}


	public String getForecastBlurp() {
		return forecastBlurp;
	}


	public void setForecastBlurp(String forecastBlurp) {
		this.forecastBlurp = forecastBlurp;
	}
	
	

   
}
