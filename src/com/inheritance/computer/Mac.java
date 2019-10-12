package com.inheritance.computer;

public class Mac extends ComputerConfig {
    private boolean isHDD;


    public Mac(String computerName, String ram, String hardDisk, String os, String processor, int modelNo, boolean isHDD) {
        super(computerName, ram, hardDisk, os, processor, modelNo);
        this.isHDD = isHDD;
    }

    @Override
    public String toString() {
        return "Mac: " + this.isHDD();
    }

    public boolean isHDD() {
        return isHDD;
    }

    public void setHDD(boolean HDD) {
        isHDD = HDD;
    }
}
