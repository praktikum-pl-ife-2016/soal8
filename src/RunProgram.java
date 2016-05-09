public class RunProgram {
    public static void main(String[] args) {
   
    Tank objek1 = new Tank();
    objek1.Nama("Tank");
    objek1.nomorProduksi("7762");
    objek1.Manufaktur("PT.Pindad");
    objek1.Warna("Abu-Abu");
    objek1.bahanBakar("solar");
    objek1.tampil();
    
    JetSki objek2 = new JetSki();
    objek2.Nama("Jet Ski");
    objek2.nomorProduksi("3324");
    objek2.Manufaktur("Yamaha");
    objek2.Warna("Biru dan Putih");
    objek2.bahanBakar("solar");
    objek2.tampil();
    
    Jet objek3 = new Jet();
    objek3.Nama("Jet");
    objek3.nomorProduksi("4423");
    objek3.Manufaktur("AirBus");
    objek3.Warna("Merah dan Putih");
    objek3.bahanBakar("avtur");
    objek3.tampil();
    
    }
}

