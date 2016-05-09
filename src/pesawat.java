
package kendaraan;

public class pesawat extends kendaraanUdara{
    String nama ;
    String noProduksi;
    String manufaktur;
    String warna;
    
    public void nama() {
        this.nama = "Nama: Pesawat";
        System.out.println(nama);
    }

    public void noProduksi() {
        this.noProduksi = "No Produksi: 119597";
        System.out.println(noProduksi);
    }

    public void manufaktur() {
        this.manufaktur = "Manufaktur: Boeing";
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
