public abstract class KendaraanLaut implements Kendaraan {

    String nama, nomorProduksi, manufaktur, warna;

    KendaraanLaut(String nama, String nomorProduksi, String manufaktur, String warna) {
        this.nama = nama;
        this.nomorProduksi = nomorProduksi;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public abstract void getCaraOperasi();

    @Override
    public abstract void getBahanBakar();

    public void displayMessage(){
        System.out.println("Nama         : " + nama);
        System.out.println("No Produk    : " + nomorProduksi);
        System.out.println("Manufaktur   : " + manufaktur);
        System.out.println("Warna        : " + warna);
    }
}