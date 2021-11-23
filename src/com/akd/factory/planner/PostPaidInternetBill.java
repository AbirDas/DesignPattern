package com.akd.factory.planner;

import com.akd.factory.helper.InternetBillPlanner;

public class PostPaidInternetBill extends InternetBillPlanner {

	@Override
	public int getRate() {
		return 3;
	}

	@Override
	public int getGB() {
		return 100;
	}

}
