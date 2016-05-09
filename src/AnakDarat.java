public class AnakDarat extends KendaraanDarat {

    public AnakDarat(String nama, String noProk, String manufaktur, String warna) {
        super(nama, noProk, manufaktur, warna);
    }
    
    @Override
    public String bahanBakar() {
        return "Bensin";
    }
    
}
