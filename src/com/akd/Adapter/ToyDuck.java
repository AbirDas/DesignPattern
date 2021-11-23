package com.akd.Adapter;

import com.akd.Adapter.helper.ToyBird;

public class ToyDuck implements ToyBird{

	@Override
	public void quack() {
		System.out.println("Toy Quack Quack");
	}

}
