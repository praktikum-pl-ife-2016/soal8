public class MainKendaraan {

    public static void main(String[] args) {

        String batas = ".........................................................";
        System.out.println(batas);
        Bus bus = new Bus("Bus", "1234", "Ferrari", "Biru");
        bus.Tampilan();
        bus.getCaraOperasi();
        bus.getJenisBahanBakar();
        System.out.println(batas);

        KapalLaut kapal = new KapalLaut("Kapal Laut", "4321", "Hyundai", "Putih");
        kapal.Tampilan();
        kapal.getCaraOperasi();
        kapal.getJenisBahanBakar();
        System.out.println(batas);

        Jet jet = new Jet("Jet", "3412", "Toyota", "Hijau");
        jet.Tampilan();
        jet.getCaraOperasi();
        jet.getJenisBahanBakar();
        System.out.println(batas);
    }
}
