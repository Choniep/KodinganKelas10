package com.hitung;

public class Limas extends BangunRuang {
    double La;

    public void HitungVolume() {
        volume = La * tinggi / 3;
        System.out.println("Volume Limas: " + volume);
    }
}
