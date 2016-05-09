package kendaraan;

public class KendaraanUdara implements Kendaraan {
    
    private String nama, nomor, manuf, warna;
    
    public KendaraanUdara(String nama, String nomor, String manuf, String warna) {
        this.nama = nama;
        this.nomor = nomor;
        this.manuf = manuf;
        this.warna = warna;
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama \t\t: " +this.nama);
    }

    @Override
    public void tampilkanNomor() {
        System.out.println("No prod \t: " +this.nomor);
    }

    @Override
    public void tampilkanManuf() {
        System.out.println("Manufaktur \t: " +this.manuf);
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna \t\t: " +this.warna);
    }

    @Override
    public void tampilkanOperasi() {
        System.out.println("Cara beroperasi terbang di atas langit");
    }

    @Override
    public void tampilkanBBM() {
        
    }

}
