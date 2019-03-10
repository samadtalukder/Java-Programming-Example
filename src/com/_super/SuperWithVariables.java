package com._super;

class Colors {
    String colorName = "Red";
    int colorCode = 7;
}

class AnotherColors extends Colors {
    String colorName = "Black";
    int colorCode = 25;

    void display() {
        System.out.println("Print Color Name: " + super.colorName + "\nColor Code: " + super.colorCode);
        System.out.println("Print Color Name: " + colorName + "\nColor Code: " + colorCode);
    }
}

public class SuperWithVariables {
    public static void main(String[] args) {
        AnotherColors anotherColors = new AnotherColors();
        anotherColors.display();

    }
}
