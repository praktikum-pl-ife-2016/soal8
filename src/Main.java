/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

public class Main {

    public static void main(String[] args) {
        Mobil m = new Mobil("Kereta", 13424, "INDO", "MERAH", "Solar");
        m.display();
        Kapal k = new Kapal("Kapal", 13124, "VISCA", "SILVER", "Solar");
        k.display();
        Pesawat p = new Pesawat("Pesawat", 15768, "GARUDA", "PUTIH", "Bensol");
        p.display();
    }
}
