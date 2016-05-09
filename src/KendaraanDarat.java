package javaapplication45;

public class KendaraanDarat implements Kendaraan {

    private String nama, Noprod, Manu, Warna;

    public KendaraanDarat(String nama, String Noprod, String Manu, String Warna) {
        this.nama = nama;
        this.Noprod = Noprod;
        this.Manu = Manu;
        this.Warna = Warna;
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama        : " + this.nama);
    }

    @Override
    public void tampilkanNoprod() {
        System.out.println("No prod     : " + this.Noprod);
    }

    @Override
    public void tampilkanManu() {
        System.out.println("Manufaktur  : " + this.Manu);
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna       : " + this.Warna);
    }

    public void tampilkanOperasi() {
        System.out.println("Cara beroperasi berjalan di permukaan darat.");
    }

    public void tampilkanBensin() {

    }
}
