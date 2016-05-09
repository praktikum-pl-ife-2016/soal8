/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Rezananda
 */
public class Pesawat extends KendaraanUdara {

    public Pesawat(String nm, String noP, String Manufak, String War) {
        super(nm, noP, Manufak, War);
    }
    
    public void bahanBakar(){
        System.out.println("Bahan bakar pesawat adalah aftur");
    }
    
}
