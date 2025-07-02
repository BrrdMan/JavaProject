package com.jsp.p2;

class Battery {
    private int capacity;
    private final int upperLimit;
    private final int lowerLimit;

    public Battery(int capacity, int upperLimit, int lowerLimit) {
        this.capacity = capacity;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    public void charge(int amount) {
        if (capacity + amount > upperLimit) {
            capacity = upperLimit;
        } else {
            capacity += amount;
        }
        System.out.println("Battery charged: " + capacity + "%");
    }

    public void discharge(int amount) {
        if (capacity - amount < lowerLimit) {
            capacity = lowerLimit;
        } else {
            capacity -= amount;
        }
        System.out.println("Battery discharged: " + capacity + "%");
    }

    public int getCapacity() {
        return capacity;
    }
}