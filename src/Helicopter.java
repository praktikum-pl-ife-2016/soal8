public class Helicopter extends Udara{
    @Override
    public void display() {
        System.out.println("-------------------");
        System.out.println("Nama : " + nama
                + "\nNo Prod. : " + nomorProduksi
                + "\nManufaktur : " + manufaktur
                + "\nWarna : " +warna);
        System.out.println("Cara beroperasi dengan menggunakan Baling-baling dan terbang di udara."
                + "\nBahan bakar yang digunakan adalah "+bahanBakar);
    }
    
}
