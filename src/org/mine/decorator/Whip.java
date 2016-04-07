package org.mine.decorator;

import org.mine.decorator.abstractclazz.Beverage;
import org.mine.decorator.abstractclazz.CondimentDecorator;

/**
 * Whip -- 具体装饰者
 * @author johnzhu
 *
 */
public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc()+", Whip";
	}

	@Override
	public double cost() {
		return .23+beverage.cost();
	}

}
