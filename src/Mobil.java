
public class Mobil extends Darat {

    @Override
    public void display() {
        System.out.println("-------------------");
        System.out.println("Nama : " + nama
                + "\nNo Prod. : " + nomorProduksi
                + "\nManufaktur : " + manufaktur
                + "\nWarna : " +warna);
        System.out.println("Cara beroperasi dengan menggunakan roda atau berjalan di darat."
                + "\nBahan bakar yang digunakan adalah "+bahanBakar);
    }
    
    
}
