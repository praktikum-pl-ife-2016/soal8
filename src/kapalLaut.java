
package kendaraan;

public class kapalLaut extends kendaraanLaut {

    String nama ;
    String noProduksi;
    String manufaktur;
    String warna;
    String caraBeroperasi;
    
    public void nama() {
        this.nama = "Nama: Kapal Laut";
        System.out.println(nama);
    }

    public void noProduksi() {
        this.noProduksi = "No Produksi: 119595";
        System.out.println(noProduksi);
    }

    public void manufaktur() {
        this.manufaktur = "Manufaktur: Kawasaki";
        System.out.println(manufaktur);
    }

    public void warna() {
        this.warna = "Warna: Putih";
        System.out.println(warna);
    }
    public void caraBeroperasi(){
        super.caraBeroperasi();
    }
    public void bahanBakar(){
        super.bahanBakar();
    }
    
}
