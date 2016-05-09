
public class KendaraanLaut implements Kendaraan {

    private String nama, prod, manufaktur, warna;

    public KendaraanLaut(String nama, String prod, String manufaktur, String warna) {
        this.nama = nama;
        this.prod = prod;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public void nama() {
        System.out.println("Nama\t\t: " + this.nama);
    }

    @Override
    public void prod() {
        System.out.println("No Prod\t\t: " + this.prod);
    }

    @Override
    public void manufaktur() {
        System.out.println("Mannufaktur\t: " + this.manufaktur);
    }

    @Override
    public void warna() {
        System.out.println("Warna\t\t: " + this.warna);
    }

    @Override
    public void cara() {
        System.out.println("Cara beroperasi menyelam di dalam laut atau berlayar di permukaan laut");
    }

    @Override
    public void bahanBakar() {
    }

}
