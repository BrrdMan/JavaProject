package com.jsp.p2;

class Mobile {
    private Battery battery;

    public Mobile(Battery battery) {
        this.battery = battery;
    }

    public void call() {
        System.out.println("Making a call...");
        battery.discharge(10);
    }

    public void chat() {
        System.out.println("Chatting...");
        battery.discharge(5);
    }

    public void playVideo() {
        System.out.println("Playing video...");
        battery.discharge(15);
    }

    public void playGames() {
        System.out.println("Playing games...");
        battery.discharge(20);
    }

    public void mobileCharging(int amount) {
        System.out.println("Charging mobile...");
        battery.charge(amount);
    }

    public void checkBattery() {
        System.out.println("Current battery level: " + battery.getCapacity() + "%");
    }
}
