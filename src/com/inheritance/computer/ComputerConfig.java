package com.inheritance.computer;

public class ComputerConfig {
    private String computerName;
    private String ram;
    private String hardDisk;
    private String os;
    private String processor;
    private int modelNo;


    public ComputerConfig(String computerName, String ram, String hardDisk, String os, String processor, int modelNo) {
        this.computerName = computerName;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.os = os;
        this.processor = processor;
        this.modelNo = modelNo;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }
}
