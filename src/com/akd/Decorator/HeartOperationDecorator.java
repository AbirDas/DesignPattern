package com.akd.Decorator;

import com.akd.Decorator.Helper.Hospital;

public class HeartOperationDecorator extends HospitalDecorator{

	public HeartOperationDecorator(Hospital hsp) {
		super(hsp);
	}
	
	@Override
	public String job() {
		return hsp.job() + " & Heart Operation";
	}
	
	@Override
	public int bill() {
		return hsp.bill() + 100;
	}

}
