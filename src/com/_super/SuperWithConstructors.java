package com._super;


class Animal {
    Animal() {
        System.out.println("Animal Class");
    }

    Animal(String name) {
        System.out.println("Animal Class "+name);
    }
}

class Birds extends Animal {
    Birds() {
        super("hello");
        System.out.println("Birds Class");
    }
}

public class SuperWithConstructors {
    public static void main(String[] args) {
        Birds birds = new Birds();

    }
}
