public class MainKendaraan {

    public static void main(String[] args) {
        Bus m = new Bus("Pariwisata", 12345, "Daihatsu", "Merah");
        KapalLaut m1 = new KapalLaut("Feri", 56789, "Kapal", "White Blue");
        Pesawat m2 = new Pesawat("Lion", 124676, "Lion", "White");
        m.display();
        m1.display();
        m2.display();
    }
}