public class KapalLaut extends KendaraanLaut {

    KapalLaut(String name, String noProd, String manufaktur, String warna) {
        super(name, noProd, manufaktur, warna);
    }

    @Override
    public void getCaraOperasi() {
        System.out.println("Cara beroperasi berlayar di permukaan laut");
    }

    @Override
    public void getJenisBahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah solar");
    }
}
