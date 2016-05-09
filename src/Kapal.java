public class Kapal extends Laut {

    Kapal(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }

    @Override
    public void getOperasi() {
        System.out.println("Cara beroperasi kendaraan ini di atas air");
    }

    @Override
    public void getBahanBakar() {
        System.out.println("Kendaraan ini menggunakan bahan bakar solar");
    }

}
