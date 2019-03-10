package com._super;

class PersonEx {
    int pID;
    String pName;

    PersonEx(int pID, String pName) {
        this.pID = pID;
        this.pName = pName;
    }
}

class Emp extends PersonEx {
    private float pSalary;

    Emp(int pID, String pName, float pSalary) {
        // reusing base constructor
        super(pID, pName);
        this.pSalary = pSalary;
    }

    void display() {
        System.out.println("Employee ID: " + pID + "\nEmployee Name: " + pName + "\nEmployee Salary: " + pSalary);
    }

}

public class SuperRealExample {
    public static void main(String[] args) {
        Emp emp = new Emp(1, "Kazi", 20500);
        emp.display();
    }
}
