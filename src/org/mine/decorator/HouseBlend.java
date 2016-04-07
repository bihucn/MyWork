package org.mine.decorator;

import org.mine.decorator.abstractclazz.Beverage;
/**
 * 混合咖啡---具体组件
 * @author johnzhu
 *
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend(){
		super.desc = "HouseBlend";
	}

	@Override
	public double cost() {
		return .89;
	}

}
