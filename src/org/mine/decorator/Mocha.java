package org.mine.decorator;

import org.mine.decorator.abstractclazz.Beverage;
import org.mine.decorator.abstractclazz.CondimentDecorator;
/**
 * 摩卡 ---- 具体装饰者
 * @author johnzhu
 *
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	

	@Override
	public String getDesc() {
		
		return beverage.getDesc()+", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
