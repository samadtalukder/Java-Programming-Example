package com.operator;

public class InstanceofOperator {
    public static void main(String[] args) {
        Person person = new Person();
        Boy boy = new Boy();
        System.out.println("person instanceof Boy:" + (person instanceof Person));
        System.out.println("boy instanceof CallBackInterface:" + (boy instanceof CallBackInterface));
    }
}

class Person {

}

class Boy extends Person implements CallBackInterface {

}

interface CallBackInterface {

}
