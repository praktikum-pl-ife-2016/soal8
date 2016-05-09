
public class Mobil extends Darat {

    Mobil(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }
    
    @Override
     public void getOperasi(){
         System.out.println("Kendaraan ini beroperasi di atas tanah");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Kendaraan ini menggunakan bahan bakar bensin");
      }

    
}