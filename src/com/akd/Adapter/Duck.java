package com.akd.Adapter;

import com.akd.Adapter.helper.Bird;

public class Duck implements Bird{

	@Override
	public void fly() {
		System.out.println("duck flying");
	}

	@Override
	public void makeSound() {
		System.out.println("quack quack");
	}

}
