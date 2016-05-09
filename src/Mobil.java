
package mainkendaraan;

public class Mobil extends KendaraanDarat {

    public Mobil(String nama, String no, String jenis, String warna) {
        super(nama, no, jenis, warna);
    }

   
  
    public void bahanBakar(){
        System.out.println("Bahan bakar yang di gunakan di kendaraan tersebut adalah solar atau uranium");
    }
    
}
