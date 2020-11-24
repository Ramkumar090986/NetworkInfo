package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("Wifi Name: Delink");
	}
public static void main(String[] args) {
	Wifi w1=new Wifi();
	w1.wifiName();
	MobileData md=new MobileData();
	md.dataName();
	Lan l1=new Lan();
	l1.lanName();
	Wireless w2=new Wireless();
	w2.modamName();
}

	
}

