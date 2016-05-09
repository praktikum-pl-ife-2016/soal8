/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

import java.util.Scanner;

/**
 *
 * @author Rezananda
 */
public class MainKendaraan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bus m1 = new Bus("Mobil", "1234", "Hyundai", "Putih");
        m1.Nama();
        m1.nomorProduksi();
        m1.manufaktur();
        m1.warna();
        m1.caraBeroprasi();
        m1.bahanBakar();
        System.out.println("");

        KapalSelam m2 = new KapalSelam("Kapal", "1234", "Yamaha", "hitam");
        m2.Nama();
        m2.nomorProduksi();
        m2.manufaktur();
        m2.warna();
        m2.caraBeroprasi();
        m2.bahanBakar();
        System.out.println("");

        Pesawat m3 = new Pesawat("Pesawat", "1234", "Garuda", "merah");
        m3.Nama();
        m3.nomorProduksi();
        m3.manufaktur();
        m3.warna();
        m3.caraBeroprasi();
        m3.bahanBakar();
        System.out.println("");
        

    }
}
