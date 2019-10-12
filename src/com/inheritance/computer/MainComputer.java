package com.inheritance.computer;

public class MainComputer {
    public static void main(String[] args) {

        Mac mac = new Mac("MacBook Pro", "8GB", "128", "MAC", "Intel", 0, true);

        Windows windows = new Windows("","","128", "Windows", "Intel", 0, 64);

        Linux linux = new Linux("","","128", "Windows", "Intel", 0, "Ubuntu");

        System.out.println(mac.getComputerName());
        System.out.println(windows);
        System.out.println(linux);

    }
}
