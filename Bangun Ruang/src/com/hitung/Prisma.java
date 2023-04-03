package com.hitung;

public class Prisma extends BangunRuang {
    double t;
    double alas;

    public void HitungVolume() {
        volume = alas * tinggi * t / 3;
        System.out.println("Volume Prisma: " + volume);
    }
}
