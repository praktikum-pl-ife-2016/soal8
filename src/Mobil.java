package Bab8;

public class Mobil extends KendaraanDarat {

    public Mobil(String nama, int noProd, String manufak, String warna) {
        super(nama, noProd, manufak, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Mobil Berbahan Bakar Bensin");
    }

    public void show() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("No Produksi : " + super.getNo());
        System.out.println("Manufaktur : " + super.getManufak());
        System.out.println("Warna : " + super.getWarna());
        super.caraBeroperasi();
        bahanBakar();
        System.out.println("====================================");
    }

}
