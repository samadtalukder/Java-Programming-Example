package com.inheritance.computer;

public class Windows extends ComputerConfig {
    private int bitType;

    public Windows(String computerName, String ram, String hardDisk, String os, String processor, int modelNo, int bitType) {
        super(computerName, ram, hardDisk, os, processor, modelNo);
        this.bitType = bitType;
    }

    @Override
    public String toString() {
        return "Windows: " + this.getBitType();
    }

    public int getBitType() {
        return bitType;
    }

    public void setBitType(int bitType) {
        this.bitType = bitType;
    }
}
