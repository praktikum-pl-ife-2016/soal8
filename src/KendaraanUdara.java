/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-cQUXFW
 */
public abstract class KendaraanUdara implements Kendaraan {

    private String nama, prod, manufaktur, warna;

    public KendaraanUdara(String nama, String prod,String manufaktur, String warna) {
        this.nama = nama;
        this.prod = prod;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public void bahanBakar() {
    }

    @Override
    public void nama() {
        System.out.println("Nama\t\t: " + this.nama);
    }

    @Override
    public void prod() {
        System.out.println("No Prod\t\t: " + this.prod);
    }

    @Override
    public void manufaktur() {
        System.out.println("Mannufaktur\t: " + this.manufaktur);
    }

    @Override
    public void warna() {
        System.out.println("Warna\t\t: " + this.warna);
    }

    @Override
    public void cara() {
        System.out.println("Cara beroperasi terbang di udara");
    }

}
