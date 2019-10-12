package com.collection_frameworks.arraylist.contacts;

public class Contacts {
    private String name;
    private String mobileNo;

    public Contacts(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public static Contacts createContacts(String name, String mobileNo) {
        return new Contacts(name, mobileNo);
    }
}

