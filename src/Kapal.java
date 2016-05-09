
package mainkendaraan;

public class Kapal extends KendaraanLaut {

    public Kapal(String nama, String no, String jenis, String warna) {
        super(nama, no, jenis, warna);
    }

 
    public void bahanBakar(){
        System.out.println("Bahan bakar yang di gunakan kapal solar atau sebangsa nya ");
    }
    
}
