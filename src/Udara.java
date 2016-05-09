public abstract class Udara implements Kendaraan {
    String nama, nomorProduksi, manufaktur, warna, bahanBakar;
    
    @Override
    public void Nama(String nama) {
        this.nama = nama;
    }

    @Override
    public void nomorProduksi(String nomorProduksi) {
        this.nomorProduksi = nomorProduksi;
    }

    @Override
    public void Manufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    @Override
    public void Warna(String warna) {
        this.warna = warna;
    }

    @Override
    public void bahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public abstract void display();
}