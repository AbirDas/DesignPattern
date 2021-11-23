package com.akd.factory.helper;

public abstract class BillPlanner implements Planner {

	protected int rate;

	public abstract int getRate();

	public void displayBill(int unit) {
		//System.out.println("rate = "+rate);
		System.out.println(getRate() * unit);
	}

}
