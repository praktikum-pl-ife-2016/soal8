public class Main {
    public static void main(String[] args) {
   
    Mobil objek1 = new Mobil();
    objek1.Nama("Mobil");
    objek1.nomorProduksi("123456");
    objek1.Manufaktur("honda");
    objek1.Warna("Merah");
    objek1.bahanBakar("premium, solar, pertamax");
    objek1.display();
    
    PerahuBoat objek2 = new PerahuBoat();
    objek2.Nama("Perahu Boat");
    objek2.nomorProduksi("23546485");
    objek2.Manufaktur("PEEIEIII");
    objek2.Warna("Silver");
    objek2.bahanBakar("solar");
    objek2.display();
    
    Helicopter objek3 = new Helicopter();
    objek3.Nama("Helicopter");
    objek3.nomorProduksi("3354618561");
    objek3.Manufaktur("BRIZZZ");
    objek3.Warna("Black Campaign");
    objek3.bahanBakar("avtur");
    objek3.display();
    
    }
}
