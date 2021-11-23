package com.akd.Decorator;

import com.akd.Decorator.Helper.Diganose;
import com.akd.Decorator.Helper.Hospital;
import com.akd.Decorator.Helper.Operation;
import com.akd.Decorator.Helper.Walkin;

public class MainDecorator {

	public static void main(String[] args) {
		Hospital dHospital = new Diganose();
		Hospital oHospital = new Operation();
		Hospital wHospital = new Walkin();
		
		Hospital decorator = new BloodtestDecorator(new HeartOperationDecorator(wHospital));
		System.out.println(decorator.job());
		System.out.println(decorator.bill());
		
		decorator = new ENTDignoseDecorator(dHospital);
		System.out.println(decorator.job());
		System.out.println(decorator.bill());
	}

}
