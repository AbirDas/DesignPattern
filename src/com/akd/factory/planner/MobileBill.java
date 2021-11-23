package com.akd.factory.planner;

import com.akd.factory.helper.BillPlanner;

public class MobileBill extends BillPlanner {
	
	@Override
	public int getRate() {
		return 5;
	}

	@Override
	public void displayBill(int unit) {
		System.out.print("this mobile talk time bill = ");
		super.displayBill(unit);
	}

	
}
