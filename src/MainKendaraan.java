
package kendaraan;

public class MainKendaraan {
    public static void main (String[] args){
        
        kapalLaut obj1 = new kapalLaut();
        pesawat obj2 = new pesawat();
        mobil obj3 = new mobil();
        
        obj1.nama();
        obj1.manufaktur();
        obj1.noProduksi();
        obj1.warna();
        obj1.caraBeroperasi();
        obj1.bahanBakar();
        System.out.println("=================");
        obj2.nama();
        obj2.manufaktur();
        obj2.noProduksi();
        obj2.warna();
        obj2.caraBeroperasi();
        obj2.bahanBakar();
        System.out.println("==================");
        obj3.nama();
        obj3.manufaktur();
        obj3.noProduksi();
        obj3.warna();
        obj3.caraBeroperasi();
        obj3.bahanBakar();
    }
}
