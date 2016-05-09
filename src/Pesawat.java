package Interface;

public class Pesawat extends KendaraanUdara {
    
     public void Display(){
         System.out.println("===============================");
        System.out.println("Jenis Kendaraan : " + nama);
        System.out.println("No Produksi     : " + no);
        System.out.println("Manufaktur      : " + manufaktur);
        System.out.println("Warna           : " + warna);
    }
      public void CaraOperasi(){
        System.out.println("Caranya adalah terbang menggunakan sayap dan wingtail");
    }
    
    
    
    
}
