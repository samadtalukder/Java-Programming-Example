package com.collection_frameworks.arraylist.example1;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMain {
    private static Scanner scanner = new Scanner(System.in);
    private static PlayerList playerList = new PlayerList();

    public static void main(String[] args) {
        boolean exit = false;
        int choice = 0;
        printInstructions();
        while (!exit) {
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    playerList.printPlayerList();
                    break;
                case 2:
                    addPlayerName();
                    break;
                case 3:
                    modifyPlayerName();
                    break;
                case 4:
                    removePlayerName();
                    break;
                case 5:
                    findPlayer();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    exit = true;
                    break;
            }
        }

    }

    private static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(playerList.getPlayerList());
        ArrayList<String> nextArrayList = new ArrayList<>(playerList.getPlayerList());
        String playerArray[] = new String[playerList.getPlayerList().size()];
        playerArray = playerList.getPlayerList().toArray(playerArray);

    }

    private static void printInstructions() {
        System.out.println("\n Press");
        System.out.print("\n 0 - To Print Choice Options");
        System.out.print("\n 1 - To Print The List Of Players");
        System.out.print("\n 2 - To add an item in the list");
        System.out.print("\n 3 - To modify an item to the list");
        System.out.print("\n 4 - To remove an item from the list");
        System.out.print("\n 5 - To search for an item in the list");
        System.out.print("\n 6 - To exit the application");
    }

    private static void addPlayerName() {
        System.out.println("Please enter the player name: ");
        playerList.addPlayer(scanner.nextLine());
    }

    private static void modifyPlayerName() {
        System.out.print("Current Player Name: ");
        String currentPlayerName = scanner.nextLine();
        //System.out.print("Enter item Number: ");
        //int position = scanner.nextInt();
        //scanner.nextLine();
        System.out.print("Enter Replacement Player Name: ");
        String replacePlayerName = scanner.nextLine();
        //playerList.modifyPlayer(position, replacePlayerName);
        playerList.modifyPlayer(currentPlayerName, replacePlayerName);
    }

    private static void removePlayerName() {
        System.out.print("Enter Player Name: ");
        //int position = scanner.nextInt();
        String playerName = scanner.nextLine();
        //scanner.nextLine();
        playerList.removedPlayer(playerName);
    }

    private static void findPlayer() {
        System.out.print("Search for player: ");
        String search = scanner.nextLine();
        if (playerList.searchPlayer(search) != null) {
            System.out.print("Found: " + search);
        } else {
            System.out.println(search + " Not found");
        }
    }
}
