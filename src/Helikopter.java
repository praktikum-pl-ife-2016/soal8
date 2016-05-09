package kendaraan;

public class Helikopter extends KendaraanUdara {

    public Helikopter(String nama, String nomor, String manuf, String warna) {
        super(nama, nomor, manuf, warna);
    }
    
    public void tampilkanBBM() {
        System.out.println("Bahan bakar yang digunakan adalah avtur");
    }
    
}
