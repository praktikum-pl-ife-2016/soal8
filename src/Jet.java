public class Jet extends KendaraanUdara {

    Jet(String name, String noProd, String manufaktur, String warna) {
        super(name, noProd, manufaktur, warna);
    }

    @Override
    public void getCaraOperasi() {
        System.out.println("Cara beroperasi terbang di udara menggunakan sayap");
    }

    @Override
    public void getJenisBahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah avtur");
    }
}
