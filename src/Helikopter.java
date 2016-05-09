

public class Helikopter extends Udara {

    Helikopter(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }

    @Override
    public void getOperasi() {
        System.out.println("Kendaraan ini beroperasi di udara");
    }

    @Override
    public void getBahanBakar() {
        System.out.println("Kendaraan ini menggunakan bahan bakar aftur");
    }

}
