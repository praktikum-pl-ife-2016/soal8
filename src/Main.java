public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil ("New","Merah");
        Helicopter heli = new Helicopter ("Herculer", "putih");
        KapalBoot boot =new KapalBoot ("boot", "biru");
        mobil.tampilan();
        heli.tampilan();
        boot.tampilan();
    }
}
