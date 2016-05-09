
public class Bus extends KendaraanDarat {

    public Bus(String nama, String prod, String manufaktur, String warna) {
        super(nama, prod, manufaktur, warna);
    }
    public void bahanBakar (){
        System.out.println("Bahan Bakar yang digunakan adalah solar atau diesel");
    }
}
