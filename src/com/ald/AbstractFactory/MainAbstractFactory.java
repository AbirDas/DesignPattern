package com.ald.AbstractFactory;

import com.akd.factory.helper.BillType;
import com.akd.factory.helper.FactoryType;
import com.akd.factory.helper.Planner;

public class MainAbstractFactory {
	public static void main(String[] arg) {

		AbstractFactory internetPlanner = Factorycreator.getFactory(FactoryType.InternetType);
		Planner bill = internetPlanner.getInternetBill(BillType.mobileBill);
		bill.displayBill(10);

		bill = internetPlanner.getInternetBill(BillType.landLineBill);
		bill.displayBill(10);

		AbstractFactory talktimeBill = Factorycreator.getFactory(FactoryType.billType);
		Planner tBill = talktimeBill.getBill(BillType.mobileBill);
		tBill.displayBill(10);
	}
}
