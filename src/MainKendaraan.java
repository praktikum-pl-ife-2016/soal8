/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.nama();
        m.noProd();
        m.manu();
        m.warna();
        m.operasi();
        m.bahanbakar();
        System.out.println("");
        
        KapalSelam k = new KapalSelam();
        k.nama();
        k.noProd();
        k.manu();
        k.warna();
        k.operasi();
        k.bahanbakar();
        System.out.println("");
        
        Pesawat p = new Pesawat();
        p.nama();
        p.noProd();
        p.manu();
        p.warna();
        p.operasi();
        p.bahanbakar();
        System.out.println("");
    }
}
