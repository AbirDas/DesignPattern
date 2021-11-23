package com.ald.AbstractFactory;

import com.akd.factory.helper.BillType;
import com.akd.factory.helper.Planner;
import com.akd.factory.planner.LandLineInternetBill;
import com.akd.factory.planner.MobileInternetBill;
import com.akd.factory.planner.PostPaidInternetBill;

public class InternetFactory implements AbstractFactory {

	@Override
	public Planner getBill(String type) {
		return null;
	}

	@Override
	public Planner getInternetBill(String type) {
		if(type == null) return null;
		if(type.equalsIgnoreCase(BillType.mobileBill)) return new MobileInternetBill();
		if(type.equalsIgnoreCase(BillType.landLineBill)) return new LandLineInternetBill();
		if(type.equalsIgnoreCase(BillType.postPaidBill)) return new PostPaidInternetBill();
		return null;
	}

}
