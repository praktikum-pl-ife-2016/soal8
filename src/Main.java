
public class Main {
    public static void main(String[] args) {
        Kendaraan[] k = new Kendaraan[3];
        k[0] = new Perahu();
        k[1] = new Mobil();
        k[2] = new Pesawat();
        for(Kendaraan kendaraan : k){
            kendaraan.nama();
            kendaraan.noProduksi();
            kendaraan.manufaktur();
            kendaraan.warna();
            kendaraan.operasi();
            kendaraan.bahanBakar();
            System.out.println("");
        }
    }
}
