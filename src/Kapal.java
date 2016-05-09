
public class Kapal extends KendaraanLaut {

    public Kapal(String nama, String prod, String manufaktur, String warna) {
        super(nama, prod, manufaktur, warna);
    }

    public void bahanBakar(){
        System.out.println("Bahan bakar yang digunakan adalah solar atau uranium");
    }
}
