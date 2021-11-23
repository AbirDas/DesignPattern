package com.akd.Decorator.Helper;

public class Operation implements Hospital{

	@Override
	public String job() {
		return "Performing Operation";
	}

	@Override
	public int bill() {
		return 100;
	}

}
