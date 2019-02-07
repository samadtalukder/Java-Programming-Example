package com.autoboxing_unboxing;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bangladesh Bank");
        if (bank.addBranch("Dhaka")) {
            System.out.println("Dhaka Branch Created");
        }
        bank.addCustomer("Dhaka", "Kabir", 2000);
        bank.addCustomer("Dhaka", "Tahsan", 2000);
        bank.addCustomer("Dhaka", "Nila", 2000);
        bank.addCustomerTransaction("Dhaka", "Kabir", 2000);
        bank.addCustomerTransaction("Khulna", "Tahsan", 2000);
        bank.addCustomerTransaction("Chattogram", "Nila", 2000);
        bank.customerList("Dhaka", true);


    }
}
