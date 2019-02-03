package com.collection_frameworks.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating ArrayList of type "String" which means we can only add "String" elements
        ArrayList<String> stringArrayList = new ArrayList<>();
        // Add element to ArrayList
        stringArrayList.add("Test 1");
        stringArrayList.add("Test 2");
        stringArrayList.add("Test 3");
        // print elements to an arrayList
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        // Add element at particular index of ArrayList
        stringArrayList.add(1, "Paglu 1");
        System.out.println("ArrayList after add index operation:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        // Remove elements from ArrayList like this
        stringArrayList.remove("Test 1");
        System.out.println("ArrayList after remove operation:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        // Remove element from the specified index
        stringArrayList.remove(1);
        System.out.println("ArrayList after remove specified index operation:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        // Update/Replace specified index element
        stringArrayList.set(0, "Hello");
        System.out.println("ArrayList after update specified index element operation:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        //  arrayList size
        System.out.println("ArrayList size:" + stringArrayList.size());
        // Append Collection elements to ArrayList
        ArrayList<String> anotherStrList = new ArrayList<>();
        anotherStrList.add("Cricket");
        anotherStrList.add("Football");
        anotherStrList.add("Hockey");
        anotherStrList.addAll(stringArrayList);
        System.out.println("ArrayList after Append Collection elements operation:");
        for (String str : anotherStrList) {
            System.out.println(str);
        }
        // Insert all the collection elements to the specified position in ArrayList
        anotherStrList.addAll(1,stringArrayList);
        System.out.println("ArrayList after Insert all the elements to the specified position:");
        for (String str : anotherStrList) {
            System.out.println(str);
        }
        // Get Sub List of ArrayList
        ArrayList<String> subArrayList = new ArrayList<>(anotherStrList.subList(2,5));
        System.out.println("ArrayList after Sub List of ArrayList:");
        for (String str : subArrayList) {
            System.out.println(str);
        }
        // last index of ArrayList elements
        System.out.println("Last index of ArrayList elements: "+subArrayList.lastIndexOf("Football"));
        // Get element from ArrayList
        System.out.println("First element of the ArrayList: "+subArrayList.get(0));
        System.out.println("Second element of the ArrayList: "+subArrayList.get(1));
        // Get the index of  first occurrence of the element in the ArrayList
        System.out.println("Index of 'Hello': "+anotherStrList.indexOf("Hello"));
        // Check whether element exists in ArrayList
        System.out.println("ArrayList contains the string 'Sports': " +anotherStrList.contains("Sports"));
        System.out.println("ArrayList contains the string 'Hockey': " +anotherStrList.contains("Hockey"));
        // Empty an ArrayList
        // System.out.println("Remove: "+anotherStrList.removeAll(anotherStrList));
        anotherStrList.clear();
        System.out.println("Clear: "+anotherStrList);
        // Creating an empty array list there are no type
        ArrayList arrayList = new ArrayList();
        // Adding elements to an arrayList
        arrayList.add("Zero");
        arrayList.add(0);
        System.out.println(arrayList);
    }

}
