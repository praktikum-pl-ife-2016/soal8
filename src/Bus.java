public class Bus extends KendaraanDarat {

    Bus(String name, String noProd, String manufaktur, String warna) {
        super(name, noProd, manufaktur, warna);
    }

    @Override
    public void getCaraOperasi() {
        System.out.println("Cara beroperasi berjalan di darat menggunakan roda");
    }

    @Override
    public void getJenisBahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah solar");
    }
}
