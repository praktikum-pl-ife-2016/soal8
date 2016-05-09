/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Rezananda
 */
public class KendaraanDarat implements Kendaraan{
    private String nama, NoProduksi, Manufaktur, Warna, caraBeroprasi;
    
    public KendaraanDarat(String nm, String noP, String Manufak, String War){
       
     this.nama = nm;
     this.NoProduksi = noP;
        this.Manufaktur = Manufak;
        this.Warna = War;
    }
    @Override
    public void Nama() {
        System.out.println("Nama : " + this.nama);
    }

    @Override
    public void nomorProduksi() {
        System.out.println("No Prod : " + this.NoProduksi);

    }

    @Override
    public void manufaktur() {
        System.out.println("Manufaktur : " + this.Manufaktur);
    }

    @Override
    public void warna() {
        System.out.println("Warna : " + this.Warna);
    }

    @Override
    public void caraBeroprasi() {
        System.out.println("cara beroprasi berjalan diatas tanah");
    }

    @Override
    public void bahanBakar() {
 
    }
    
}
