package com.akd.factory;

import com.akd.factory.helper.BillPlanner;
import com.akd.factory.helper.BillType;

public class MainFactory {

	public static void main(String[] args) {
		BillFactory factory = new BillFactory();
		BillPlanner myBill = factory.getplan(BillType.mobileBill);
		System.out.print(BillType.mobileBill+" = ");
		myBill.displayBill(10);
		
		
		myBill = factory.getplan(BillType.landLineBill);
		System.out.print(BillType.landLineBill+" = ");
		myBill.displayBill(10);
		
		myBill = factory.getplan(BillType.postPaidBill);
		System.out.print(BillType.postPaidBill+" = ");
		myBill.displayBill(10);
		
		myBill = factory.getplan("something");
		System.out.print("something = ");
		myBill.displayBill(10);
	}

}
