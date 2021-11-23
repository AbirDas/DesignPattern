package com.akd.factory.planner;

import com.akd.factory.helper.BillPlanner;

public class DefaultBill extends BillPlanner{

	@Override
	public int getRate() {
		return 3;
	}

}
