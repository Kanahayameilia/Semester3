/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

// Kelas Abstrak
abstract class Hewan {
    // Metode abstrak (tidak memiliki isi)
    abstract void suara();
}

// Kelas Turunan 1
class Kucing extends Hewan {
    // Implementasi metode abstrak
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

// Kelas Turunan 2
class Anjing extends Hewan {
    // Implementasi metode abstrak
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode suara()
        kucing.suara();
        anjing.suara();
    }
}
