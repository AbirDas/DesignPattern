package com.akd.Decorator.Helper;

public class Walkin implements Hospital{

	@Override
	public String job() {
		return "Walk in Hospital";
	}

	@Override
	public int bill() {
		return 10;
	}

}
