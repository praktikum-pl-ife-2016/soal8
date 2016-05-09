package javaapplication45;

public class Mobil extends KendaraanDarat {

    public Mobil(String nama, String Noprod, String Manu, String Warna) {
        super(nama, Noprod, Manu, Warna);
    }

    public void tampilkanBensin() {
        System.out.println("Bahan bakar yang digunakan adalah pertamax.");
    }

}
