package com.hitung;

public class Tabung extends BangunRuang {
    public void HitungVolume() {
        volume = Math.PI * jari * jari * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }
}
