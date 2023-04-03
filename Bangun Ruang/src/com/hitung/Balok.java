package com.hitung;

public class Balok extends BangunRuang {
    public void HitungVolume() {
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok: " + volume);
    }
}
