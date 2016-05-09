public class MainKendaraan {

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("Sedan", "11111", "Ford", "Merah");
        mobil1.nama();
        mobil1.nomorProduksi();
        mobil1.manufaktur();
        mobil1.warna();
        mobil1.caraops();
        mobil1.bahanbakar();
        System.out.println("==============================================");
        
        KapalLaut kapal1 = new KapalLaut("Tanker","99999","Toyota","Silver");
        kapal1.nama();
        kapal1.nomorProduksi();
        kapal1.manufaktur();
        kapal1.warna();
        kapal1.caraops();
        kapal1.bahanbakar();
        System.out.println("==============================================");
        
        Pesawat pesawat1 = new Pesawat("Boeing","72777","Garuda","Putih");
        pesawat1.nama();
        pesawat1.nomorProduksi();
        pesawat1.manufaktur();
        pesawat1.warna();
        pesawat1.caraops();
        pesawat1.bahanbakar();
        System.out.println("==============================================");
       
                
           
    }

}
