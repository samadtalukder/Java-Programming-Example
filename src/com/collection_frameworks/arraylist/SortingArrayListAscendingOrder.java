package com.collection_frameworks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListAscendingOrder {
    public static void main(String[] args) {
        ArrayList<String> listOfCompany = new ArrayList<>();
        listOfCompany.add("Google");
        listOfCompany.add("Facebook");
        listOfCompany.add("Twitter");
        listOfCompany.add("Apple");
        System.out.println("Before Sorting\n");
        for (String beforeSortingStr : listOfCompany) {
            System.out.println(beforeSortingStr);
        }
        Collections.sort(listOfCompany);
        System.out.println("After Sorting\n");
        for (String afterSortingStr : listOfCompany) {
            System.out.println(afterSortingStr);
        }

        ArrayList<Integer> listOfNumber = new ArrayList<>();
        listOfNumber.add(22);
        listOfNumber.add(12);
        listOfNumber.add(3);
        listOfNumber.add(56);
        System.out.println("Before Sorting\n");
        for (int beforeSortingInt : listOfNumber) {
            System.out.println(beforeSortingInt);
        }
        Collections.sort(listOfNumber);
        System.out.println("After Sorting\n");
        for (int afterSortingInt : listOfNumber) {
            System.out.println(afterSortingInt);
        }
    }
}
