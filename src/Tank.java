public class Tank extends KendaraanDarat {
    @Override
    public void tampil() {
        System.out.println("-------------------");
        System.out.println("Nama           : " + nama
                + "\nNo Prod.       : " + nomorProduksi
                + "\nManufaktur     : " + manufaktur
                + "\nWarna          : " +warna);
        System.out.println("Cara beroperasi dengan menggunakan roda grigi dan berjalan di darat."
                + "\nBahan bakar yang digunakan adalah "+bahanBakar);
    }
    
    
}
