package com.akd.Decorator;

import com.akd.Decorator.Helper.Hospital;

public abstract class HospitalDecorator implements Hospital {
	
	Hospital hsp;
	public HospitalDecorator(Hospital hsp) {
		this.hsp = hsp;
	}

	@Override
	public String job() {
		return hsp.job();
	}

	@Override
	public int bill() {
		return hsp.bill();
	}

}
