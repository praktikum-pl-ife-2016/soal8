/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author peitrae
 */
public abstract class  kendaraanLaut implements Kendaraan{

    public void caraBeroperasi (){
        System.out.println("Cara Beroperasi: Berlayar di permukaan laut");
    }
    public void bahanBakar(){
        System.out.println("Bahan Bakar: Solar");
    }
    
}
