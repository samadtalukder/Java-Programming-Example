package com.autoboxing_unboxing;

import java.util.ArrayList;

public class Branches {
    private String branchName;
    private ArrayList<Customers> customersList;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customersList = new ArrayList<>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customersList.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double initialAmount) {
        Customers existCustomer = findCustomer(customerName);
        if (existCustomer != null) {
            existCustomer.addTransection(initialAmount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName) {
        for (int i = 0; i < customersList.size(); i++) {
            Customers checkedCustomer = customersList.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }
}
