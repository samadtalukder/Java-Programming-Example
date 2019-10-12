package com.collection_frameworks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListDescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> listOfCompanyDesc = new ArrayList<>();
        listOfCompanyDesc.add("Google");
        listOfCompanyDesc.add("Facebook");
        listOfCompanyDesc.add("Twitter");
        listOfCompanyDesc.add("Apple");
        System.out.println("Before Sorting\n");
        for (String beforeSortingStr : listOfCompanyDesc) {
            System.out.println(beforeSortingStr);
        }
        Collections.sort(listOfCompanyDesc, Collections.reverseOrder());
        System.out.println("\nAfter Sorting\n");
        for (String afterSortingStr : listOfCompanyDesc) {
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
        Collections.sort(listOfNumber,Collections.reverseOrder());
        System.out.println("After Sorting\n");
        for (int afterSortingInt : listOfNumber) {
            System.out.println(afterSortingInt);
        }
    }
}
