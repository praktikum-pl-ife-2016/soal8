package Bab8;

public class MainKendaraan {

    public static void main(String[] args) {
        Mobil m = new Mobil("Pajero", 201921837, "Mitsubishi", "Black Doph");
        KapalLaut k = new KapalLaut("Feri", 39292012, "Kapal", "White Blue");
        Pesawat p = new Pesawat("Lion", 310210294, "Lion", "White");
        m.show();
        k.show();
        p.show();
    }
}
