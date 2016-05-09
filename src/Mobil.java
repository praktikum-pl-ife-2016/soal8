public class Mobil extends KendaraanDarat {

    public Mobil(String nama, String noProduk, String manufactur, String warna) {
        super(nama, noProduk, manufactur, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bahan Bakar Menggunakan Premium atau Pertamax");
    }

    public void tampilan() {
        System.out.println("Nama \t\t: " + super.getNama());
        System.out.println("No Prod \t: " + super.getNoProduk());
        System.out.println("Manufactur \t: " + super.getManufactur());
        System.out.println("Warna \t\t: " + super.getWarna());
        bahanBakar();
        super.caraBeroperasi();
    }
}
