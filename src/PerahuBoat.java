
public class PerahuBoat extends Laut{
    @Override
    public void display() {
        System.out.println("----------------------------------------");
        System.out.println("Nama : " + nama
                + "\nNo Prod. : " + nomorProduksi
                + "\nManufaktur : " + manufaktur
                + "\nWarna : " +warna);
        System.out.println("Cara beroperasi dengan mengapung di permukaan laut dan melaju dibantu dengan mesin."
                + "\nBahan bakar yang digunakan adalah "+bahanBakar);
    }
    
}
