
package kendaraan;

public class mobil extends kendaraanDarat{
    String nama ;
    String noProduksi;
    String manufaktur;
    String warna;
    
    public void nama() {
        this.nama = "Nama: Mobil";
        System.out.println(nama);
    }

    public void noProduksi() {
        this.noProduksi = "No Produksi: 119596";
        System.out.println(noProduksi);
    }

    public void manufaktur() {
        this.manufaktur = "Manufaktur: Honda";
        System.out.println(manufaktur);
    }

    public void warna() {
        this.warna = "Warna: Merah";
        System.out.println(warna);
    }
    public void caraBeroperasi(){
        super.caraBeroperasi();
    }
    public void bahanBakar(){
        super.bahanBakar();
    }
}
