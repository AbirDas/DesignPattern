package com.akd.factory;

import com.akd.factory.helper.BillPlanner;
import com.akd.factory.helper.BillType;
import com.akd.factory.planner.DefaultBill;
import com.akd.factory.planner.LandlineBill;
import com.akd.factory.planner.MobileBill;
import com.akd.factory.planner.PostPaidBill;

public class BillFactory {
	
	public BillPlanner getplan(String plan) {
		if(plan == null) return null;
		
		if(plan.equalsIgnoreCase(BillType.mobileBill)) return new MobileBill();
		if(plan.equalsIgnoreCase(BillType.landLineBill)) return new LandlineBill();
		if(plan.equalsIgnoreCase(BillType.postPaidBill)) return new PostPaidBill();
		return new DefaultBill();
	}
}
