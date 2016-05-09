
public class Pesawat extends KendaraanUdara{
    
     Pesawat(String name, String nmrProduksi, String manufaktur, String warna) {
        super(name, nmrProduksi, manufaktur, warna);
    }
    
      @Override
     public void getCaraOperasi(){
         System.out.println("Beroperasi di atas udara");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Bahan bakarnya adalah Aftur");
      }
}
