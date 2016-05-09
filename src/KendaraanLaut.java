package Bab8;

public abstract class KendaraanLaut implements Kendaraan {

    private String nama, warna, manufak;
    private int noProd;

    public KendaraanLaut(String nama, int noProd, String manufak, String warna) {
        this.nama = nama;
        this.noProd = noProd;
        this.manufak = manufak;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public int getNo() {
        return noProd;
    }

    public String getManufak() {
        return manufak;
    }

    public String getWarna() {
        return warna;
    }

    public abstract void bahanBakar();

    @Override
    public void caraBeroperasi() {
        System.out.println("Kendaraan Laut beroperasi dengan berlayar di permukaan laut");
    }

}
