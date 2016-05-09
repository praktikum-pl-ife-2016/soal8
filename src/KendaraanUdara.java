

    public abstract class KendaraanUdara implements Kendaraan {
    String NamaKendaraan, ManufakturKendaraan, WarnaKendaraan, BahanBakarKendaraan;
    int NomorProduksiKendaraan; 
    
    @Override
    public void NamaKendaraan(String NamaKendaraan) {
        this.NamaKendaraan = NamaKendaraan;
    }

    @Override
    public void NomorProduksiKendaraan(int NomorProduksiKendaraan) {
        this.NomorProduksiKendaraan = NomorProduksiKendaraan;
    }

    @Override
    public void ManufakturKendaraan(String ManufakturKendaraan) {
        this.ManufakturKendaraan = ManufakturKendaraan;
    }

    @Override
    public void WarnaKendaraan(String WarnaKendaraan) {
        this.WarnaKendaraan = WarnaKendaraan;
    }

    @Override
    public void BahanBakarKendaraan(String BahanBakarKendaraan) {
        this.BahanBakarKendaraan = BahanBakarKendaraan;
    }
    
    public abstract void Tampilan1();
}