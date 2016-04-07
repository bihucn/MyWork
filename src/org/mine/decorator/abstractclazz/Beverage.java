package org.mine.decorator.abstractclazz;

/**
 * 装饰者模式: 饮料基类----属于抽象组件
 * @author johnzhu
 *
 */
public abstract class Beverage {
	
	protected String desc = "Unknown Beverage";
	public String getDesc(){
		return desc;
		
	}
	public abstract double cost();

}
