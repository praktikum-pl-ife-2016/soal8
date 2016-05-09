
public class Becak extends Darat {

    Becak(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }
    
    @Override
     public void getOperasi(){
         System.out.println("Kendaraan melaju di darat.");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Kendaraan berbahan bakar tenaga manusia.");
      }   
}