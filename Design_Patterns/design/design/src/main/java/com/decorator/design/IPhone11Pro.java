package com.decorator.design;

public class IPhone11Pro extends PhoneDecorator{

	public IPhone11Pro(Iphone basicPhone) {
		super(basicPhone);
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return basicPhone.getPrice()+ 100;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+ "Pro";
	}
	
	@Override
	public int cameraCount() {
		// TODO Auto-generated method stub
		return super.cameraCount()+ 1;
	}

}
