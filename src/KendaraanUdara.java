public abstract class KendaraanUdara implements Kendaraan {

    public abstract void bahanBakar();
    private String nama;
    private String noProduk;
    private String manufactur;
    private String warna;

    public String getNama() {
        return nama;
    }

    public String getNoProduk() {
        return noProduk;
    }

    public String getManufactur() {
        return manufactur;
    }

    public String getWarna() {
        return warna;
    }

    public KendaraanUdara(String nama, String noProduk, String manufactur, String warna) {
        this.nama = nama;
        this.noProduk = noProduk;
        this.manufactur = manufactur;
        this.warna = warna;
    }

    @Override
    public void caraBeroperasi() {
        System.out.println("Cara beroperasi terbang di udara");
    }

}
