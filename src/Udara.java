

public abstract class Udara implements Kendaraan {

    String nama, nomorProduksi, manufaktur, warna, caraOperasi, bahanBakar;

    Udara(String nama, String nomorProduksi, String manufaktur, String warna) {
        this.nama = nama;
        this.nomorProduksi = nomorProduksi;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public abstract void getOperasi();

    @Override
    public abstract void getBahanBakar();

    public void display() {
        System.out.println("Nama       : " + nama);
        System.out.println("No Prod    : " + nomorProduksi);
        System.out.println("Manufaktur : " + manufaktur);
        System.out.println("Warna      : " + warna);
    }

}
