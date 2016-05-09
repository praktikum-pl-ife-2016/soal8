public class Pesawat extends KendaraanUdara {

    public Pesawat(String nama, int noProd, String manufak, String warna) {
        super(nama, noProd, manufak, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bahan bakar yang digunakan avtur");
    }

    public void display() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("No Produksi : " + super.getNo());
        System.out.println("Manufaktur : " + super.getManufak());
        System.out.println("Warna : " + super.getWarna());
        caraBeroperasi();
        bahanBakar();
        System.out.println("========================================================");
    }

}