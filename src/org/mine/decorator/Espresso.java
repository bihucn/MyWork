package org.mine.decorator;

import org.mine.decorator.abstractclazz.Beverage;

/**
 * 浓缩咖啡----具体组件
 * @author johnzhu
 *
 */
public class Espresso extends Beverage {
	
	public Espresso(){
		super.desc = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
