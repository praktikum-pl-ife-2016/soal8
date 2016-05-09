public class AnakUdara extends KendaraanUdara{

    public AnakUdara(String nama, String noProk, String manufaktur, String warna) {
        super(nama, noProk, manufaktur, warna);
    }

    @Override
    public String bahanBakar() {
        return "Aftur";
    }
    
}
