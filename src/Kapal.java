package kendaraan;

public class Kapal extends KendaraanLaut {

    public Kapal(String nama, String nomor, String manuf, String warna) {
        super(nama, nomor, manuf, warna);
    }
    
    public void tampilkanBBM() {
        System.out.println("Bahan bakar yang digunakan adalah solar");
    }
    
}
