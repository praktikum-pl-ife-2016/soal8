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
public class Bus extends KendaraanDarat{

private String bahanBakar;    

    public Bus(String nm, String noP, String Manufak, String War) {
        super(nm, noP, Manufak, War);
    }
    public void bahanBakar(){
        System.out.println("Bahan Bakarnya adalah bensin");
        
    }
    
}
