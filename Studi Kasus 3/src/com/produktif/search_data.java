package com.produktif;

import java.util.Scanner;

public class search_data {

    public static void main(String[] args) {

        int jmlData, i, j, cari;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah data yang akan dimasukkan: ");
        jmlData = scan.nextInt();

        int array[] = new int[jmlData];
        System.out.println("\nMasukkan" + jmlData + " buah data integer");
        System.out.println("===========================================");

        // input data ke dalam array
        for (i = 0; i < jmlData; i++) {
            System.out.println("Data ke-" + (i + 1) + " = ");
            array[i] = scan.nextInt();
        }

        // menampilkan data sebelum diurutkan
        System.out.println("\nData di dalam Array");
        System.out.println("===========================================");
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a] + " , ");
        }
        System.out.println("\n=========================================");

        System.out.println("Masukkan Angka Yang Mau Dicari: ");
        cari = scan.nextInt();

        // Pemanggilan fungsi pencarian
        int result = pencarian(array, cari);
        if (result == -1) {
            System.out.println("\n=====================================");
            System.out.println("Data tidak ditemukan!.");
        } else {
            System.out.println("\n=====================================");
        }
    }

    // Fungsi untuk pencarian data dengan inputan (parameter)
    // berupa data array dan nilai yang mau dicari
    public static int pencarian(int data[], int x) {
        // menghitung jumlah index array untuk looping
        int n = data.length;

        // Transverse array arr[]
        for (int i = 0; i < n; i++) {
            // jika data ditemukan akan me-return lokasi indexnya
            if (data[i] == x)
                return i;
        }
        return -1;
    }

}