public class Jet extends KendaraanUdara{
    @Override
    public void tampil() {
        System.out.println("-------------------");
        System.out.println("Nama           : " + nama
                + "\nNo Prod.       : " + nomorProduksi
                + "\nManufaktur     : " + manufaktur
                + "\nWarna          : " +warna);
        System.out.println("Cara beroperasi dengan menggunakan Mesin Jet dan terbang di udara."
                + "\nBahan bakar yang digunakan adalah "+bahanBakar);
    }
    
}
    
