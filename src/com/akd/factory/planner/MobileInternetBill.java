package com.akd.factory.planner;

import com.akd.factory.helper.InternetBillPlanner;

public class MobileInternetBill extends InternetBillPlanner{

	@Override
	public int getRate() {
		return 1;
	}

	@Override
	public int getGB() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void displayBill(int unit) {
		System.out.print("this is mobile internet bill = ");
		super.displayBill(unit);
	}
}
