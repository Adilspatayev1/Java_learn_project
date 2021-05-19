package com.company;

public class DuracelBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double internalVoltage;

    public DuracelBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower() {
        return voltage * currency + energy;
    }

    @Override
    public double getLifeTime() {
        return internalVoltage /  energy;
    }
}
