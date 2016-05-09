public class Main {

    public static void main(String[] args) {
        Mobil m = new Mobil("Kereta", 15515, "INKA", "Oranye", "Solar");
        m.display();
        Kapal k = new Kapal("Kapal", 02001, "P&O", "Emas", "Solar");
        k.display();
        Pesawat p = new Pesawat("Pesawat", 11060, "Boeing", "Putih", "Solar");
        p.display();
    }
}
