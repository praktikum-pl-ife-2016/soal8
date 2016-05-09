public class Bus extends KendaraanDarat {

    public Bus(String nama, int noProd, String manufak, String warna) {
        super(nama, noProd, manufak, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bahan Bakar yang digunakan Bensin");
    }

    public void display() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("No Produksi : " + super.getNo());
        System.out.println("Manufaktur : " + super.getManufak());
        System.out.println("Warna : " + super.getWarna());
        caraBeroperasi();
        bahanBakar();
        System.out.println("=========================================================");
    }

}