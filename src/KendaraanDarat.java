public class KendaraanDarat implements Kendaraan {
    private String nama, NoProduksi, Manufaktur, Warna, caraBeroprasi;
public KendaraanDarat(String nm, String noP, String Manufak, String War){
       
     this.nama = nm;
     this.NoProduksi = noP;
        this.Manufaktur = Manufak;
        this.Warna = War;
    }

    public void nama() {
        System.out.println("Nama : "  + this.nama);
    }

    public void nomorProduksi() {
        System.out.println("No Prod : "+  this.NoProduksi);

    }

    public void manufaktur() {
        System.out.println("Manufaktur : " + this.Manufaktur);
    }

    public void warna() {
        System.out.println("Warna : "+  this.Warna);
    }

    public void caraops() {
        System.out.println("Berjalan di Darat ");
    }

    public void bahanbakar() {
    }
}
    


