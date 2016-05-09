package Interface;

public abstract class KendaraanLaut implements Kendaraan {

      public String nama,no,manufaktur,warna;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

   
   
    public void BahanBakar(){
        System.out.println("Bahan bakarnya itu solar atau uranium");
    }
}
