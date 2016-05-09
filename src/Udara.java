

public abstract class Udara implements Kendaraan {
    
    private String nama, prod, manufak, warna, operasi, bb;

    public Udara(String n, String p, String m, String w) {
        this.nama = n;
        this.prod = p;
        this.manufak = m;
        this.warna = w;
    }

    @Override
    public void Nama() {
        System.out.println("---------------------------------");
        System.out.println("Nama\t\t: "+nama);
    }

    @Override
    public void Prod() {
        System.out.println("No Produksi\t:"+prod);
    }

    @Override
    public void Manufak() {
        System.out.println("Manufaktur\t:"+manufak);
    }

    @Override
    public void Warna() {
        System.out.println("Warna\t:"+warna);
    }

    @Override
    public void Operasi() {
        System.out.println("Cara beroperasi berjalan di atas jalan atau permukaan.");
    }

    @Override
    public void BahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah BBM.");
    }
    
}
