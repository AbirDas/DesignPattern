package com.akd.factory.helper;

public abstract class InternetBillPlanner implements Planner {
	protected int rate;

	public abstract int getRate();
	public abstract int getGB();

	public void displayBill(int unit) {
		System.out.println((getRate() * unit)+getGB());
	}
}
