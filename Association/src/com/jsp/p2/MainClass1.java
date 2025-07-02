package com.jsp.p2;

public class MainClass1 {

	public static void main(String[] args) {
		Battery battery = new Battery(50, 100, 0);
        Mobile mobile = new Mobile(battery);

        mobile.call();
        mobile.chat();
        mobile.playVideo();
        mobile.playGames();
        mobile.checkBattery();

        mobile.mobileCharging(30);
        mobile.checkBattery();

	}

}
