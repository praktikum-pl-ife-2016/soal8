
public class BalonUdara extends Udara {

    BalonUdara(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }

    @Override
    public void getOperasi() {
        System.out.println("Kendaraan ini mampu mengudara.");
    }

    @Override
    public void getBahanBakar() {
        System.out.println("Kendaraan berbahan bakar panas api.");
    }

}
