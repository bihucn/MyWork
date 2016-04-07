package org.mine.observer.impl;

import org.mine.observer.DisplayElement;
import org.mine.observer.Observer;
import org.mine.observer.Subject;

public class CurrentDisplay implements Observer, DisplayElement {
	
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.regist(this);
	}

	@Override
	public void display() {
		System.out.println("temp = "+ temp+", and humidity = "+humidity);
	}

	@Override
	public void update(float pTemp, float pHumidity, float pPressure) {
		this.temp = pTemp;
		this.humidity = pHumidity;
		display();
	}

}
