package org.mine.decorator.test;

import org.mine.decorator.Espresso;
import org.mine.decorator.HouseBlend;
import org.mine.decorator.Mocha;
import org.mine.decorator.Soy;
import org.mine.decorator.abstractclazz.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDesc() + ": $"+beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDesc() + ": $"+beverage2.cost());
		
	}
}
