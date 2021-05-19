package com.company;

public class FlashLight {
    private Battery[] batteries;

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalEnergy(){
        double total = 0;
        for(int i = 0;i < batteries.length;i++){
            total += batteries[i].getPower();
        }
        return total;
    }

    public double getTotalLifeTime(){
        double total = 0;
        for(int i = 0;i < batteries.length;i++){
            total += batteries[i].getLifeTime();
        }
        return total;
    }
}
