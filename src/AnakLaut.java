public class AnakLaut extends KendaraanLaut{

    public AnakLaut(String nama, String noProk, String manufaktur, String warna) {
        super(nama, noProk, manufaktur, warna);
    }

    @Override
    public String bahanBakar() {
        return "Solar";
    }
}
