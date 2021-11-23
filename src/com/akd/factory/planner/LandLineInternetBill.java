package com.akd.factory.planner;

import com.akd.factory.helper.InternetBillPlanner;

public class LandLineInternetBill extends InternetBillPlanner{

	@Override
	public int getRate() {
		return 2;
	}

	@Override
	public int getGB() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	@Override
	public void displayBill(int unit) {
		System.out.print("this is landline internet bill = ");
		super.displayBill(unit);
	}
}
