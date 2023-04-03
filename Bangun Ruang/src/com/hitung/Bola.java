package com.hitung;

public class Bola extends BangunRuang {
    public void HitungVolume() {
        volume = Math.PI * jari * jari * jari * 4 / 3;
        System.out.println("Volume Bola: " + volume);
    }
}
