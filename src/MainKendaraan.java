

package mainkendaraan;


public class MainKendaraan {

    public static void main(String[] args) {
      Mobil x=new Mobil("kijang","62725628","TOYOTA","Pink");
      x.nama();
      x.no();
      x.jenis();
      x.warna();
      x.cara();
      x.bahanBakar();
        System.out.println("=========================================");
        Kapal y=new Kapal("Speed boat","6371230","Honda","Abu-abu");
        y.nama();
        y.no();
        y.jenis();
        y.warna();
        y.cara();
        y.bahanBakar();
        System.out.println("==========================================");
        
        Pesawat z=new Pesawat("Boing","747","Dirgantara","putih");
        z.nama();
        z.no();
        z.jenis();
        z.warna();
        z.cara();
        z.bahanBakar();
        System.out.println("============================================");
        
      
      
    }
    
}
