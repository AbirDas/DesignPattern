package com.akd.Decorator;

import com.akd.Decorator.Helper.Hospital;

public class ENTDignoseDecorator extends HospitalDecorator{

	public ENTDignoseDecorator(Hospital hsp) {
		super(hsp);
	}
	
	@Override
	public String job() {
		return hsp.job() + " & ENT Test";
	}
	
	@Override
	public int bill() {
		return hsp.bill() + 5;
	}

}
