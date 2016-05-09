package Tugas8;

public class KendaraanLaut implements Kendaraan, Identitas {

    private String nama, nomor, manufaktur, warna;

    public KendaraanLaut(String n, String no, String m, String w) {
        this.nama = n;
        this.nomor = no;
        this.manufaktur = m;
        this.warna = w;
    }

    @Override
    public void nama() {
        System.out.println("Nama\t\t: " + this.nama);
    }

    @Override
    public void nomor() {
        System.out.println("Nomor prod\t: " + this.nomor);
    }

    @Override
    public void manufaktur() {
        System.out.println("Manufaktur\t: " + this.manufaktur);
    }

    @Override
    public void warna() {
        System.out.println("Warna\t\t: " + this.warna);
    }

    @Override
    public void caraOperasi() {
        System.out.println("Cara beroperasi menyelam di dalam laut atau berlayar di permukaan laut");
    }

}
