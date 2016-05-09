public abstract class KendaraanDarat implements Kendaraan {

    String nama, nomorProduksi, manufaktur, warna, caraOperasi, bahanBakar;

    KendaraanDarat(String nama, String nomorProduksi, String manufaktur, String warna) {
        this.nama = nama;
        this.nomorProduksi = nomorProduksi;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }
 public String getNama() {
        return nama;
    }

    public String getNomorProduksi() {
        return nomorProduksi;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public String getWarna() {
        return warna;
    }
    @Override
    public abstract void getCaraOperasi();

    @Override
    public abstract void getBahanBakar();

    public void displayMessage() {
        System.out.println("Nama         : " + nama);
        System.out.println("No Produk    : " + nomorProduksi);
        System.out.println("Manufaktur   : " + manufaktur);
        System.out.println("Warna        : " + warna);
    }
}