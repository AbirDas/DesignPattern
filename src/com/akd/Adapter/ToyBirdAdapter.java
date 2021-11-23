package com.akd.Adapter;

import com.akd.Adapter.helper.Bird;

public class ToyBirdAdapter{// extends ToyDuck{
	
	Bird bird = null;
	public ToyBirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	public void makeSound() {
		this.bird.makeSound();
	}

}
