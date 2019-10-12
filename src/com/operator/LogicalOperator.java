package com.operator;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        String userName = "admin";
        String userEmail = "admin@mail.com";
        String password = "1234";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String inputUserName = input.nextLine();
        System.out.println("Enter Email: ");
        String inputUserEmail = input.nextLine();
        System.out.println("Enter Password: ");
        String inputPassword = input.nextLine();
        if ((inputUserName.equals(userName) && (inputPassword.equals(password)) || (inputUserEmail.equals(userEmail)))) {
            System.out.println("Welcome-> " + inputUserName + "\nEmail: " + inputUserEmail);
        } else {
            System.out.println("Wrong username or password");
        }

    }
}
