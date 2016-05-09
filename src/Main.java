
public class Main {
    public static void main(String[] args) {
   
    KapalSelam kendaraan1 = new KapalSelam();
    kendaraan1.NamaKendaraan("KapalSelam");
    kendaraan1.NomorProduksiKendaraan(78900000);
    kendaraan1.ManufakturKendaraan("Zetunnn");
    kendaraan1.WarnaKendaraan("Putih");
    kendaraan1.BahanBakarKendaraan("nuklir, diesel ");
    kendaraan1.Tampilan();
    
    Pesawat kendaraan2 = new Pesawat();
    kendaraan2.NamaKendaraan("Pesawat");
    kendaraan2.NomorProduksiKendaraan(2213456);
    kendaraan2.ManufakturKendaraan("Lion");
    kendaraan2.WarnaKendaraan("Merah");
    kendaraan2.BahanBakarKendaraan("Avgas, AviationKerosine ");
    kendaraan2.Tampilan1();
    
    
    Bajaj kendaraan3 = new Bajaj();
    kendaraan3.NamaKendaraan("Bajaj");
    kendaraan3.NomorProduksiKendaraan(755678);
    kendaraan3.ManufakturKendaraan("Jajaj");
    kendaraan3.WarnaKendaraan("Merah");
    kendaraan3.BahanBakarKendaraan("BBG");
    kendaraan3.Tampilan2();
    
    
    }
}
