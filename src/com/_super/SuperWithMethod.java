package com._super;
class Person{
    void display(){
        System.out.println("Person Class");
    }
}
class Student extends Person{
    void display(){
        System.out.println("Student Class");
    }
    void message(){
        display();
        super.display();
    }
}
public class SuperWithMethod {
    public static void main(String[] args) {
        Student std = new Student();
        std.message();
    }
}
