package com.anshul.designpatterns.observer;

public class CurrentConditionDisplay implements Observer {

	private Observable obs = null;
	private Integer[] values = null;
	public CurrentConditionDisplay(Observable obs) {
		this.obs = obs;
		//svalues = new Int
	}

	@Override
	public void update(Observable o, Object arg) {

		if(o instanceof WeatherData){
//			((WeatherData)o).getHumidity();
//			((WeatherData)o).getTemp();
//			((WeatherData)o).getPressure();
		}
	}

}
