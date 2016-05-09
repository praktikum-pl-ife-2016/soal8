package Bab8;

public class KapalLaut extends KendaraanLaut {

    public KapalLaut(String nama, int noProd, String manufak, String warna) {
        super(nama, noProd, manufak, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Kapal Laut berbahan bakar solar");
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
