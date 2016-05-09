public class Pesawat extends KendaraanUdara{
    
     Pesawat(String nama, String nomorProduksi, String manufaktur, String warna) {
        super(nama, nomorProduksi, manufaktur, warna);
    }
    
      @Override
     public void getCaraOperasi(){
         System.out.println("Beroperasi di atas udara");
     }
    @Override
      public void getBahanBakar(){
          System.out.println("Bahan bakar yang digunakan Aftur");
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