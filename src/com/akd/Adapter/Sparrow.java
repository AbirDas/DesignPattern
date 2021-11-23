package com.akd.Adapter;

import com.akd.Adapter.helper.Bird;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("sparrow flying");
	}

	@Override
	public void makeSound() {
		System.out.println("chew chew");
	}

}
