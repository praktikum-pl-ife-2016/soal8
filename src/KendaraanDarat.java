/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R-PC
 */
public abstract class KendaraanDarat implements Kendaraan {
    public void operasi(){
        System.out.println("Kendaraan ini beroperasi di darat");
    }
    public abstract void bahanBakar();
}
