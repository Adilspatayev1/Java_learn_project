package com.company;

public class Main {

    public static void main(String[] args) {
        ToshibaBattery t = new ToshibaBattery(1.2, 1.5, 2.2, 5);
        DuracelBattery d = new DuracelBattery(2.3, 4, 0.9, 4);

        Battery[] batteries = {t, d};

        FlashLight f = new FlashLight(batteries);
        System.out.println(f.getTotalLifeTime());
        System.out.println(f.getTotalEnergy());
    }
}
