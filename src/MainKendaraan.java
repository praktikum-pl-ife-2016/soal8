package kendaraan;

public class MainKendaraan {

    public static void main(String[] args) {
        
        Motor m1 = new Motor("Motor", "1212", "Honda", "Hitam");
        m1.tampilkanNama();
        m1.tampilkanNomor();
        m1.tampilkanManuf();
        m1.tampilkanWarna();
        m1.tampilkanOperasi();
        m1.tampilkanBBM();
        System.out.println("");
        
        Kapal m2 = new Kapal("Kapal", "3333", "Titanic", "Putih");
        m2.tampilkanNama();
        m2.tampilkanNomor();
        m2.tampilkanManuf();
        m2.tampilkanWarna();
        m2.tampilkanOperasi();
        m2.tampilkanBBM();
        System.out.println("");
        
        Helikopter m3 = new Helikopter("Helikopter", "8888", "Hawk", "Hijau");
        m3.tampilkanNama();
        m3.tampilkanNomor();
        m3.tampilkanManuf();
        m3.tampilkanWarna();
        m3.tampilkanOperasi();
        m3.tampilkanBBM();
        System.out.println("");
    }
    
}
