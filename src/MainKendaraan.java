
public class MainKendaraan {

    public static void main(String[] args) {

        Bus a = new Bus("Bus", "1234", "Mercedes", "Hitam");
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        a.nama();
        a.prod();
        a.manufaktur();
        a.warna();
        a.cara();
        a.bahanBakar();

        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");

        Kapal b = new Kapal("kapal selam", "4567", "Yamaha", "Merah");
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        b.nama();
        b.prod();
        b.manufaktur();
        b.warna();
        b.cara();
        b.bahanBakar();
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        Pesawat c = new Pesawat("Pesawat", "777", "Garuda", "Putih - Biru");
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        c.nama();
        c.prod();
        c.manufaktur();
        c.warna();
        c.cara();
        c.bahanBakar();
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
    }
}
