package com.decorator.design;

public class Iphone implements Phone{

	@Override
	public String getName() {
		return "iphone" ;
	}

	@Override
	public int cameraCount() {
		return 2 ;
	}

	@Override
	public double getPrice() {
		return 690.90 ;
	}

}
