package Githubbab8;

public class Main {
    public static void main(String[] args) {
   
    Mobil objek1 = new Mobil();
    objek1.nama("lancer");
    objek1.nomorProduksi("0000");
    objek1.manufaktur("mitsubishi");
    objek1.warna("hitam");
    objek1.bahanBakar("bensin, solar");
    objek1.display();
    
    kapal objek2 = new kapal();
    objek2.nama("kapal layar");
    objek2.nomorProduksi("1111");
    objek2.manufaktur("roro");
    objek2.warna("putih");
    objek2.bahanBakar("angin");
    objek2.display();
    
    Pesawat objek3 = new Pesawat();
    objek3.nama("737");
    objek3.nomorProduksi("2222");
    objek3.manufaktur("Boeing");
    objek3.warna("silver");
    objek3.bahanBakar("avtur");
    objek3.display();
    
    }
}