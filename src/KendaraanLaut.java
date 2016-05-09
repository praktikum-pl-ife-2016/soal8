package kendaraan;

public abstract class KendaraanLaut implements Kendaraan {

    String nama, manufaktur, warna, bahanBakar;
    int noProduksi;

    public KendaraanLaut(String nama, String manufaktur, int noProduksi, String warna, String bahanBakar) {
        this.nama = nama;
        this.manufaktur = manufaktur;
        this.noProduksi = noProduksi;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
    }

    public String getWarna() {
        return warna;
    }

    public int getNoProduksi() {
        return noProduksi;
    }

    public String getNama() {
        return nama;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public void caraBeroperasi() {
        System.out.println("Beroperasi dengan Berlayar di permukaan laut");
    }

    public void display() {
        System.out.println("===============================");
        System.out.println("Nama        : " + getNama());
        System.out.println("No Produksi : " + getNoProduksi());
        System.out.println("Manufaktur  : " + getManufaktur());
        System.out.println("Warna       : " + getWarna());
        caraBeroperasi();
        bahanBakar();
        System.out.println("===============================");
    }
}
