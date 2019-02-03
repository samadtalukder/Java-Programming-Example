package com.collection_frameworks.arraylist.contacts;

import java.util.Scanner;

public class ContactsMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobileNo mobileNo = new MobileNo("000");

    public static void main(String[] args) {
        boolean exit = false;
        startMobile();
        printActions();
        while (!exit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    exit = true;
                    break;
                case 1:
                    mobileNo.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existContactsRecord = mobileNo.queryContacts(name);
        if (existContactsRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobileNo.removeContact(existContactsRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    private static void queryContact() {
        System.out.println("Enter Find contact name:");
        String findName = scanner.nextLine();
        Contacts findContacts = mobileNo.queryContacts(findName);
        if (findContacts == null) {
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name: " + findContacts.getName() + " Mobile No: " + findContacts.getMobileNo());
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String existName = scanner.nextLine();
        Contacts existContacts = mobileNo.queryContacts(existName);
        if (existContacts == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new mobile number:");
        String newMobile = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(newName, newMobile);
        if (mobileNo.updateContact(existContacts, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }

    }

    private static void addNewContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter mobile number:");
        String mobile = scanner.nextLine();
        Contacts newContacts = Contacts.createContacts(name, mobile);
        if (mobileNo.addNewContact(newContacts)) {
            System.out.println("New contact added: name =" + name + " , mobile = " + mobile);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");


    }

    private static void startMobile() {
        System.out.println("Starting Mobile ......");
    }
}
