package com.core;

public enum ServicePlan {

	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	


private double serviceCost;

private ServicePlan(double serviceCost) {
	this.serviceCost = serviceCost;

	}

public double getServiceCost() {
	return serviceCost;
}

public void setServiceCost(double serviceCost) {
	this.serviceCost = serviceCost;
}
@Override
public String toString() {

	return name().toUpperCase()+" plan and Service coct"+serviceCost;
}
}
