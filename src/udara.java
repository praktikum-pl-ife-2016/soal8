package Githubbab8;

public abstract class udara implements kendaraan {
    String nama, nomorProduksi, manufaktur, warna, bahanBakar;
    
    public void nama(String nama) {
        this.nama = nama;
    }

    @Override
    public void nomorProduksi(String nomorProduksi) {
        this.nomorProduksi = nomorProduksi;
    }

    public void manufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void warna(String warna) {
        this.warna = warna;
    }

    @Override
    public void bahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public abstract void display();
}