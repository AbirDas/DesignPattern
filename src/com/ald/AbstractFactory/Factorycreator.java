package com.ald.AbstractFactory;

import com.akd.factory.helper.FactoryType;

public class Factorycreator {
	public static AbstractFactory getFactory(String type) {
		if(type.equalsIgnoreCase(FactoryType.billType)) return new BillFactory();
		if(type.equalsIgnoreCase(FactoryType.InternetType)) return new InternetFactory();
		return null;
	}
}
