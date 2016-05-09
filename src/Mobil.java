
public class Mobil extends KendaraanDarat {

    Mobil(String name, String nmrProduksi, String manufaktur, String warna) {
        super(name, nmrProduksi, manufaktur, warna);
    }
    
    @Override
     public void getCaraOperasi(){
         System.out.println("Beroperasi di atas tanah");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Bahan bakarnya adalah Bensin");
      }

    
}
