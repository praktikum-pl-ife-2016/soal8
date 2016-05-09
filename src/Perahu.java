package javaapplication45;

public class Perahu extends KendaraanLaut {

    public Perahu(String nama, String Noprod, String Manu, String Warna) {
        super(nama, Noprod, Manu, Warna);
    }

    public void tampilkanBensin() {
        System.out.println("Bahan bakar yang digunakan adalah solar atau uranium.");
    }

}
