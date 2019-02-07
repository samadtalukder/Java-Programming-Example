package com.autoboxing_unboxing;

import java.util.ArrayList;

public class Customers {
    private String customerName;
    private ArrayList<Double> transection;

    public Customers(String customerName, double amount) {
        this.customerName = customerName;
        this.transection = new ArrayList<>();
        addTransection(amount);
    }

    public void addTransection(double amount) {
        transection.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransection() {
        return transection;
    }
}
