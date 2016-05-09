public class MainKendaraan {
    public static void main(String[] args) {

        Bus b1 = new Bus("Bus", "12345", "Trans Jakarta", "Merah");
        b1.displayMessage();
        System.out.println("=======================================");

        KapalLaut kapal = new KapalLaut("Kapal Laut", "56789", "Hyundai", "Putih");
        kapal.displayMessage();
        System.out.println("========================================");

        Pesawat pesawat = new Pesawat("Pesawat ", "101112", "Air Asia", "Merah");
        pesawat.displayMessage();
        System.out.println("========================================");

    }
}