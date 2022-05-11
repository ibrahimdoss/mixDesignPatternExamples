package com.decorator.design;

public class Iphone_Max extends PhoneDecorator{

	public Iphone_Max(Iphone basicPhone) {
		super(basicPhone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + "Max";
	}

}
