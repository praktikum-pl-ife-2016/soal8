package kendaraan;
public class KendaraanDarat implements Kendaraan, BagianMesin {
    private String nama;
    private String noprod;
    private String warna;
    private String manufaktur;

    public KendaraanDarat(String nama, String noprod, String warna, String manufaktur) {
        this.nama = nama;
        this.noprod = noprod;
        this.warna = warna;
        this.manufaktur = manufaktur;
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama            : " + this.nama);
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna           : " + this.warna);
    }
    
    @Override
    public void tampilkanNoprod() {
        System.out.println("No produk       : " + this.noprod);
    }
    
    @Override
    public void tampilkanManufaktur(){
        System.out.println("Manufaktur      : "+ this.manufaktur);
    }
    
    @Override
    public void perilaku() {
        System.out.println("Cara beroperasi digunakan di darat.");
    }

    @Override
    public void bahanbakar() {
        System.out.println("Bahan bakar yang digunakan adalah solar atau bensin.");
    }

}

