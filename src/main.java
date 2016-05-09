package javaapplication45;

public class main {

    public static void main(String[] args) {

        System.out.println("==========================================================================");
        Mobil m = new Mobil("Mobil", "0209", "Jazz", "Putih");
        m.tampilkanNama();
        m.tampilkanNoprod();
        m.tampilkanManu();
        m.tampilkanWarna();
        m.tampilkanOperasi();
        m.tampilkanBensin();
        System.out.println("==========================================================================");

        System.out.println("==========================================================================");
        Perahu p = new Perahu("Perahu", "0812", "Honda", "Kuning");
        p.tampilkanNama();
        p.tampilkanNoprod();
        p.tampilkanManu();
        p.tampilkanWarna();
        p.tampilkanOperasi();
        p.tampilkanBensin();
        System.out.println("==========================================================================");

        System.out.println("==========================================================================");
        Pesawat pes = new Pesawat("Pesawat", "1234", "Etihad", "Merah");
        pes.tampilkanNama();
        pes.tampilkanNoprod();
        pes.tampilkanManu();
        pes.tampilkanWarna();
        pes.tampilkanOperasi();
        pes.tampilkanBensin();
        System.out.println("==========================================================================");
    }
}
