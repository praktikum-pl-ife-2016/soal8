/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

public abstract class KendaraanDarat implements Kendaraan {

    String nama, manufaktur, warna, bahanBakar;
    int noProduksi;

    public KendaraanDarat(String nama, int noProduksi, String manufaktur, String warna, String bahanBakar) {
        this.nama = nama;
        this.manufaktur = manufaktur;
        this.noProduksi = noProduksi;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
    }

    public String getNama() {
        return nama;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public String getWarna() {
        return warna;
    }

    public int getNoProduksi() {
        return noProduksi;
    }

    public void caraBeroperasi() {
        System.out.println("Cara beroperasi bergerak di daratan");
    }

    public void display() {
        System.out.println("=================================");
        System.out.println("Nama        : " + getNama());
        System.out.println("No Produksi : " + getNoProduksi());
        System.out.println("Manufaktur  : " + getManufaktur());
        System.out.println("Warna       : " + getWarna());
        caraBeroperasi();
        bahanBakar();
        System.out.println("==================================");
    }
}


