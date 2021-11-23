package com.ald.AbstractFactory;

import com.akd.factory.helper.Planner;

public interface AbstractFactory {
	public Planner getBill(String type);
	public Planner getInternetBill(String type);
}
