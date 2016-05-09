package kendaraan;

public class Motor extends KendaraanDarat {

    public Motor(String nama, String nomor, String manuf, String warna) {
        super(nama, nomor, manuf, warna);
    }
    
    public void tampilkanBBM() {
        System.out.println("Bahan bakar yang digunakan adalah premium atau pertamax");
    }
    
}
