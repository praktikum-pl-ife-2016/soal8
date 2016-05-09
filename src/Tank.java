package Tugas8;

public class Tank extends KendaraanDarat {

    public Tank(String n, String no, String m, String w) {
        super(n, no, m, w);
    }

    public void bahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah solar atau uranium");
    }
}
