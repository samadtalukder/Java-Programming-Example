package com.collection_frameworks.arraylist.contacts;

import java.util.ArrayList;

public class MobileNo {
    private String myNumber;
    private ArrayList<Contacts> contactsList;

    public MobileNo(String myNumber) {
        this.myNumber = myNumber;
        this.contactsList = new ArrayList<>();
    }

    public MobileNo() {
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactsList.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContacts, Contacts newContacts) {
        int findPosition = findContact(oldContacts);
        if (findPosition < 0) {
            System.out.println(oldContacts.getName() + " , was not find");
            return false;
        } else if (findContact(newContacts.getName()) != -1) {
            System.out.println("Contact with name " + newContacts.getName() + " already exists.  Update was not successful.");
            return false;
        }
        this.contactsList.set(findPosition, newContacts);
        System.out.println(oldContacts.getName() + " , was replaced with " + newContacts.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts) {
        int findPosition = findContact(contacts);
        if (findPosition < 0) {
            System.out.println(contacts.getName() + " , was not found.");
            return false;
        }
        contactsList.remove(findPosition);
        System.out.println(contacts.getName() + " , was deleted.");
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contactsList.size(); i++) {
            Contacts contacts = contactsList.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contacts contacts) {
        return this.contactsList.indexOf(contacts);
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContacts(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return contactsList.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + "." + "Name: " + contactsList.get(i).getName() + " Mobile No: " + contactsList.get(i).getMobileNo());
        }
    }
}
