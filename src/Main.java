package Interface;

public class Main {
    public static void main(String[] args) {
   
    Ferry objek1 = new Ferry();
    objek1.setNama("Ferry");
    objek1.setNo("123456");
    objek1.setManufaktur("Allinone");
    objek1.setWarna("Putih");
    objek1.Display();
    objek1.BahanBakar();
    objek1.CaraOperasi();
    
    Pesawat objek2 = new Pesawat();
    objek2.setNama("Pesawat");
    objek2.setNo("78910");
    objek2.setManufaktur("Citilink");
    objek2.setWarna("Hijau");
    objek2.Display();
    objek2.BahanBakar();
    objek2.CaraOperasi();
    
    Mobil objek3 = new Mobil();
    objek3.setNama("Mobil");
    objek3.setNo("112233");
    objek3.setManufaktur("Karimun");
    objek3.setWarna("Black");
    objek3.Display();
    objek3.BahanBakar();
    objek3.CaraOperasi();
    
    }
}

    

