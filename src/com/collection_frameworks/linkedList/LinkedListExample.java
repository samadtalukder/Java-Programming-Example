package com.collection_frameworks.linkedList;


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating object of class linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding elements to the linked list
        linkedList.add("Linked");
        linkedList.add("List");
        System.out.println(linkedList);
        // Adding elements first to the linked list
        linkedList.addFirst("Hello");
        System.out.println(linkedList);
        // Adding elements last to the linked list
        linkedList.addLast("Program");
        System.out.println(linkedList);
        // Removing elements from the linked list
        linkedList.remove();
        System.out.println("Remove: "+linkedList);
        linkedList.remove(2);
        System.out.println("Remove: "+linkedList);

    }
}
