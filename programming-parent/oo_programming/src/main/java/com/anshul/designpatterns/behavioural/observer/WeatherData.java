package com.anshul.designpatterns;

public class WeatherData extends Observable {

	
	private Float temp;
	private Float pressure;
	private Float humidity;
	
	
	public void setMeasurements(Float temp, Float pressure, Float humidity) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		
		setChanged();
		notifyObservers();
	}
	
	public Float getHumidity() {
		return humidity;
	}
	public Float getPressure() {
		return pressure;
	}
	public Float getTemp() {
		return temp;
	}

	public static void main(java.lang.String[] args) {
		System.out.println("Hi");
	}
}
