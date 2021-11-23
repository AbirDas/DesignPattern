package com.ald.AbstractFactory;

import com.akd.factory.helper.BillType;
import com.akd.factory.helper.Planner;
import com.akd.factory.planner.LandlineBill;
import com.akd.factory.planner.MobileBill;
import com.akd.factory.planner.PostPaidBill;

public class BillFactory implements AbstractFactory{

	@Override
	public Planner getBill(String type) {
		if(type == null) return null;
		if(type.equalsIgnoreCase(BillType.mobileBill)) return new MobileBill();
		if(type.equalsIgnoreCase(BillType.landLineBill)) return new LandlineBill();
		if(type.equalsIgnoreCase(BillType.postPaidBill)) return new PostPaidBill();
		return null;
	}

	@Override
	public Planner getInternetBill(String type) {
		return null;
	}

}
