package com.hitung;

public class Kerucut extends BangunRuang {
    public void HitungVolume() {
        volume = Math.PI * jari * jari * tinggi / 3;
        System.out.println("Volume Kerucut: " + volume);
    }
}
