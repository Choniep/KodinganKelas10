package com.petanikode;

class Drone {
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    public Drone(int energi, int ketinggian, int kecepatan) {
        this.energi = energi;
        this.ketinggian = ketinggian;
        this.kecepatan = kecepatan;
    }

    // method
    void terbang() {
        energi--;
        if (energi > 10) {
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
        } else {
            System.out.println("Energi lemah: Drone ngga bisa terbang");
        }
    }

    void matikanMesin() {
        if (ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun() {
        // ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok() {
        energi--;
        System.out.println("Drone berbelok");
    }

    void maju() {
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur() {
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }

    void display() {
        System.out.println("Sisa energi: " + this.energi);
        System.out.println("Ketinggian saat ini: " + this.ketinggian);
        System.out.println("Kecepatan saat ini: " + this.kecepatan);
    }
}

public class main {
    public static void main(String[] args) {
        Drone mini2 = new Drone(180, 100, 100);

        mini2.terbang();
        mini2.matikanMesin();
        mini2.turun();
        mini2.belok();
        mini2.maju();
        mini2.mundur();
        mini2.display();

    }
}
