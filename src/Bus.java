public class Bus extends KendaraanDarat {

    Bus(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }
    
    @Override
     public void getCaraOperasi(){
         System.out.println("Beroperasi di atas tanah");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Bahan bakarnya adalah Bensin");
      }
      public void displayMessage() {
        System.out.println("Nama         : " + nama);
        System.out.println("No Produk    : " + nomorProduksi);
        System.out.println("Manufaktur   : " + manufaktur);
        System.out.println("Warna        : " + warna);
        getCaraOperasi();
        getBahanBakar();
    }

    
}