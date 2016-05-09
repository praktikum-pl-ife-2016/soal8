package soalpraktikum8;

public abstract class kendaraanUdara implements Kendaraan {

    private String nama, warna, manufaktur, noProd;

    public kendaraanUdara(String nama, String manufaktur, String no, String warna) {
        this.nama = nama;
        this.manufaktur = manufaktur;
        this.noProd = no;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public String getNo() {
        return noProd;
    }

    public abstract void bahanBakar();

    public void beroperasi() {
        System.out.println("Kendaraan Udara beroperasi di daerah udara atau yang berawan");
    }

}
