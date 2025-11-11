/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo10;

/**
 *
 * @author user
 */
// File: Main.java

interface Pembayaran {
    double hitungPajak(double harga);
}

class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; // Pajak 10%
    }
}

class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05; // Pajak 5%
    }
}

public class Pbo10 {
    public static void main(String[] args) {

        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaLaptop = 5000000;
        double hargaRoti = 20000;

        System.out.println("Harga Laptop: Rp" + hargaLaptop);
        System.out.println("Pajak Laptop (10%): Rp" + elektronik.hitungPajak(hargaLaptop));

        System.out.println("\nHarga Roti: Rp" + hargaRoti);
        System.out.println("Pajak Roti (5%): Rp" + makanan.hitungPajak(hargaRoti));
    }
}

