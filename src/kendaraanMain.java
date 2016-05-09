

public class kendaraanMain {

    public static void main(String[] args) {
        kendaraan[] nama = new kendaraan[3];
        nama[0] = new kendaraanDokar();
        nama[1] = new kendaraanGetek();
        nama[2] = new kendaraanJet();
        
        for(int i=0;i<nama.length;i++){
            System.out.println("\n\n");
            nama[i].nama();
            nama[i].nomor();
            nama[i].manufaktur();
            nama[i].warna();
            nama[i].ket();
            nama[i].tenaga();
        }
    }
}
