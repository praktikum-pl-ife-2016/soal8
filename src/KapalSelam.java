

public class KapalSelam extends Laut {

    KapalSelam(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }
    @Override
    public void getOperasi() {
        System.out.println("Kndaraan yang berada di air.");
    }
    @Override
    public void getBahanBakar() {
        System.out.println("Kendaraan brbahan bakar nuklir.");
    }
}
