package com.akd.Decorator;

import com.akd.Decorator.Helper.Hospital;

public class BloodtestDecorator extends HospitalDecorator{

	public BloodtestDecorator(Hospital hsp) {
		super(hsp);
	}
	
	@Override
	public String job() {
		return hsp.job() + " & Blood Test";
	}
	
	@Override
	public int bill() {
		return hsp.bill() + 10;
	}
	
}
