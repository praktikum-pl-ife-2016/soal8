

public abstract class KendaraanDarat implements Kendaraan {

    String nama, nomorProduksi, manufaktur, warna, caraOperasi, bahanBakar;

    KendaraanDarat(String name, String nmrProduksi, String manufaktur, String warna) {
        this.nama = name;
        this.nomorProduksi = nmrProduksi;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public abstract void getCaraOperasi();

    @Override
    public abstract void getBahanBakar();

    public void display() {
        System.out.println("Nama       : " + nama);
        System.out.println("No Prod    : " + nomorProduksi);
        System.out.println("Manufaktur : " + manufaktur);
        System.out.println("Warna      : " + warna);
    }
}
