package org.mine.decorator;

import org.mine.decorator.abstractclazz.Beverage;
import org.mine.decorator.abstractclazz.CondimentDecorator;
/**
 * 豆奶 -- 具体装饰者
 * @author johnzhu
 *
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		
		return beverage.getDesc() + ", Soy";
	}

	@Override
	public double cost() {
		return .21 + beverage.cost();
	}

}
