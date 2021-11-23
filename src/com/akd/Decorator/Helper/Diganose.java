package com.akd.Decorator.Helper;

public class Diganose implements Hospital{

	@Override
	public String job() {
		return "Performing Diganose";
	}

	@Override
	public int bill() {
		return 50;
	}

}
