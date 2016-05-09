package soalpraktikum8;

public class kapalFeri extends kendaraanLaut {

    public kapalFeri(String nama, String manufaktur, String no, String warna) {
        super(nama, manufaktur, no, warna);
    }

    public void bahanBakar() {
        System.out.println("Kapal Feri berbahan bakar solar");
    }

    public void tampilan() {
        System.out.println("Nama         : " + super.getNama());
        System.out.println("Manufaktur   : " + super.getManufaktur());
        System.out.println("No Produksi  : " + super.getNo());
        System.out.println("Warna        : " + super.getWarna());
        bahanBakar();
        super.beroperasi();
        System.out.println("==================================================");

    }
}
