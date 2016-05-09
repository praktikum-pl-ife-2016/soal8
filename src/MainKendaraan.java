
package kendaraan;

public class MainKendaraan {

    public static void main(String[] args) {
        Mobil m = new Mobil("Motor", 1276383 ,"HONDA",   "biru", "Premium");
        m.display();
        KapalLaut k = new KapalLaut("Kapal",  02001,"P&O" , "Emas", "Solar");
        k.display();
        Pesawat p = new Pesawat("Pesawat ",  28744," Boeing",  "Biru ", "Solar");
        p.display();
    }
}
