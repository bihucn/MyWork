package org.mine.observer.test;

import org.mine.observer.impl.CurrentDisplay;
import org.mine.observer.impl.WeatherData;

public class MyTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentDisplay cd = new CurrentDisplay(weatherData);
		weatherData.setMeasurements(12, 32, 33);
	}
}
