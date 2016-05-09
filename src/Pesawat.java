
package mainkendaraan;

public class Pesawat extends KendaraanUdara {

    public Pesawat(String nama, String no, String jenis, String warna) {
        super(nama, no, jenis, warna);
    }
    public void bahanBakar(){
        System.out.println("pesawat menggunakan bahan bakar Avtur");
    }
    
}
