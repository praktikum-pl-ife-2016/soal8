public class Main {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("Jazz","1234","Honda","Putih");
        m1.tampilan();
        System.out.println("================================");
        Kapal k1 = new Kapal("Kapal Pesiar","1111","Xbm","Putih");
        k1.tampilan();
        System.out.println("================================");
        Pesawat p1 = new Pesawat("Garuda","G112","Indo","Biru");
        p1.tampilan();
    }
}