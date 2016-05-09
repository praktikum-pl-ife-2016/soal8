
public class MainKendaraan1 {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("Mobil", "1234", "Honda", "Hitam");
        mobil1.display();
        mobil1.getCaraOperasi();
        mobil1.getBahanBakar();
        System.out.println("==============================================");

        Boat boat = new Boat("Boat", "5678", "Yamaha", "Putih");
        boat.display();
        boat.getCaraOperasi();
        boat.getBahanBakar();
        System.out.println("==============================================");

        Pesawat pesawat = new Pesawat("Pesawat tempur", "1122", "Garuda Air", "Silver");
        pesawat.display();
        pesawat.getCaraOperasi();
        pesawat.getBahanBakar();
        System.out.println("==============================================");

    }
}
