package com.collection_frameworks.arraylist.example1;

import java.util.ArrayList;

public class PlayerList {
    private ArrayList<String> playerArrayList = new ArrayList<String>();

    public void addPlayer(String playerName) {
        playerArrayList.add(playerName);
    }

    public void printPlayerList() {
        System.out.println("You have " + playerArrayList.size() + " items in your player list");
        for (int i = 0; i < playerArrayList.size(); i++) {
            //System.out.println((i + 1) + " . " + playerArrayList.get(i));
            System.out.println((i) + " . " + playerArrayList.get(i));
        }
    }

    /* public void modifyPlayer(int position, String modifyPlayerName) {
         playerArrayList.set(position, modifyPlayerName);
         System.out.println("Player Name " + (position + 1) + " has been modified");
     }*/
    public void modifyPlayer(String currentPlayer, String modifyPlayerName) {
        int position = findItem(currentPlayer);
        if (position >= 0) {
            modifyPlayer(position, modifyPlayerName);
        }
    }

    public ArrayList<String> getPlayerList() {
        return playerArrayList;
    }

    private void modifyPlayer(int position, String modifyPlayerName) {
        playerArrayList.set(position, modifyPlayerName);
        System.out.println("Player Name " + (position + 1) + " has been modified");
    }

    private int findItem(String currentPlayer) {
        return playerArrayList.indexOf(currentPlayer);
    }

    public void removedPlayer(String playerName) {
        int position = findItem(playerName);
        if (position >= 0) {
            removedPlayer(position);
        }
    }

    public void removedPlayer(int position) {
        playerArrayList.remove(position);
    }


    public String searchPlayer(String searchPlayer) {
        int position = playerArrayList.indexOf(searchPlayer);
        if (position >= 0) {
            return playerArrayList.get(position);
        }
        return null;
    }
}
