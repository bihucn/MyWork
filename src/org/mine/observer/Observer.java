package org.mine.observer;

/**
 * 观察者模式
 * @author johnzhu
 *
 */

public interface Observer {

	
	public void update(float temp, float humidity, float pressure);
}
