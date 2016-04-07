package org.mine.observer.impl;

import java.util.ArrayList;
import java.util.List;

import org.mine.observer.Observer;
import org.mine.observer.Subject;

public class WeatherData implements Subject {
	
	@SuppressWarnings("rawtypes")
	private List observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void regist(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		int index = observers.indexOf(o);
		if (index > 0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanges(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}

}
