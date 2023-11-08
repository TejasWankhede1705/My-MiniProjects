package com.core;

public enum RoomType {
/*Bill(double), annualIncome(double),roomType ( GENERAL(2000), 
 * SPECIAL(5000), SEMI-SPECIAL(3000),ICU(7000)).*/

General(2000),SPECIAL(5000),SEMISPECIAL(3000),ICU(7000);
	
private double roomCharges;

private RoomType(double roomCharges) {
	this.roomCharges = roomCharges;
}
	
public String toString() {
	return"[RoomType = " + name().toUpperCase() + " Charges = " +roomCharges + "]";
}

public double getRoomCharges() {
	return roomCharges;
}

public void setRoomCharges(double roomCharges) {
	this.roomCharges = roomCharges;
}	
	

}
