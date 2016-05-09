
public class MainKendaraan {

    public static void main(String[] args) {

        Mobil m1 = new Mobil("Mobil", "11223344", "Lamborghini", "Kuning");
        m1.display();
        m1.getOperasi();
        m1.getBahanBakar();
        System.out.println("*********************************************");

        Kapal k = new Kapal("Kapal", "11332244", "Azamara", "Putih");
        k.display();
        k.getOperasi();
        k.getBahanBakar();
        System.out.println("**********************************************");

        Helikopter heli = new Helikopter("Helikopter", "44332211", "Eurocopter", "Silver");
        heli.display();
        heli.getOperasi();
        heli.getBahanBakar();
        System.out.println("**********************************************");
    }

}
