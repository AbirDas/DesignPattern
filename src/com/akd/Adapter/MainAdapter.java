package com.akd.Adapter;

import com.akd.Adapter.helper.Bird;
import com.akd.Adapter.helper.ToyBird;

public class MainAdapter {

	public static void main(String[] args) {
		ToyBird toyBird = new  ToyDuck();
		Bird bird = new Duck();
		
		toyBird.quack();
		bird.makeSound();
		
		ToyBirdAdapter adapter = new ToyBirdAdapter(new Sparrow());
		adapter.makeSound();
	}

}
