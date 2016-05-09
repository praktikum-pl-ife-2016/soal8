/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

public class Main {

    public static void main(String[] args) {
        Mobil m = new Mobil("Kereta", 45657, "INDONESIA", "ORANYE", "Solar");
        m.display();
        Perahu k = new Perahu("Perahu", 85522, "AREMA", "PUTIH", "Solar");
        k.display();
        Helikopter p = new Helikopter("Helikopter", 13536, "B&B", "SILVER", "Bensol");
        p.display();
    }
}
