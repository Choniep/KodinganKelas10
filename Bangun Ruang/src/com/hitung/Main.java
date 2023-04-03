package com.hitung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        Bola bola = new Bola();
        Kerucut kerucut = new Kerucut();
        Prisma prisma = new Prisma();
        Limas limas = new Limas();
        Tabung tabung = new Tabung();

        Scanner inputan = new Scanner(System.in);

        // volume kubus:
        System.out.println("\nHitung Volume Kubus");
        System.out.println("====================");
        System.out.println("Masukkan panjang rusuk: ");
        kubus.rusuk = inputan.nextInt();
        kubus.HitungVolume();

        // volume balok
        System.out.println("\nHitung Volume Balok");
        System.out.println("====================");
        System.out.println("Masukkan panjang balok: ");
        balok.panjang = inputan.nextInt();
        System.out.println("Masukkan lebar balok: ");
        balok.lebar = inputan.nextInt();
        System.out.println("Masukkan tinggi balok: ");
        balok.tinggi = inputan.nextInt();
        balok.HitungVolume();

        // volume tabung
        System.out.println("\nHitung Volume Tabung");
        System.out.println("====================");
        System.out.println("Masukkan jari-jari tabung: ");
        tabung.jari = inputan.nextInt();
        System.out.println("Masukkan tinggi tabung: ");
        tabung.tinggi = inputan.nextInt();
        tabung.HitungVolume();

        // volume kerucut
        System.out.println("\nHitung Volume Kerucut");
        System.out.println("====================");
        System.out.println("Masukkan jari-jari kerucut: ");
        kerucut.jari = inputan.nextInt();
        System.out.println("Masukkan tinggi kerucut: ");
        kerucut.tinggi = inputan.nextInt();
        kerucut.HitungVolume();

        // volume limas
        System.out.println("\nHitung Volume Limas");
        System.out.println("====================");
        System.out.println("Masukkan luas alas limas: ");
        limas.La = inputan.nextInt();
        System.out.println("Masukkan tinggi limas: ");
        limas.tinggi = inputan.nextInt();
        limas.HitungVolume();

        // volume prisma
        System.out.println("\nHitung Volume Prisma");
        System.out.println("====================");
        System.out.println("Masukkan alas prisma: ");
        prisma.alas = inputan.nextInt();
        System.out.println("Masukkan tinggi: ");
        prisma.tinggi = inputan.nextInt();
        System.out.println("Masukkan tinggi prisma: ");
        prisma.t = inputan.nextInt();
        prisma.HitungVolume();

        // volume bola
        System.out.println("\nHitung Volume Bola");
        System.out.println("===================="); 
        System.out.println("Masukkan jari-jari bole: ");
        bola.jari = inputan.nextInt();
        bola.HitungVolume();
    }
}
