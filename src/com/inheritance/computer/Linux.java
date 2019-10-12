package com.inheritance.computer;

public class Linux extends ComputerConfig {
    private String distributionName;

    public Linux(String computerName, String ram, String hardDisk, String os, String processor, int modelNo,String distributionName) {
        super(computerName, ram, hardDisk, os, processor, modelNo);
        this.distributionName=distributionName;
    }

    @Override
    public String toString() {
        return "Linux: " + this.getDistributionName();
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    @Override
    public String getRam() {
        return super.getRam();
    }
}
