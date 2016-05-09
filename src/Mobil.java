package Interface;

public class Mobil extends KendaraanDarat{
    
     public void Display(){
         System.out.println("==============================="); 
        System.out.println("Jenis Kendaraan : " + nama);
        System.out.println("No Produksi     : " + no);
        System.out.println("Manufaktur      : " + manufaktur);
        System.out.println("Warna           : " + warna);
    }
      public void CaraOperasi(){
        System.out.println("Caranya adalah menggerakkan roda menggunakan setir dan gas");
    }
    

}
