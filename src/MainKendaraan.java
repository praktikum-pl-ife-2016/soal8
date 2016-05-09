public class MainKendaraan {

    public static void main(String[] args) {

        Taxi tx = new Taxi("Taxi", "15515020111", "Blue Bird", "Biru Tosca");
        System.out.println("");
        tx.display();
        tx.getOperasi();
        tx.getBahanBakar();
        System.out.println("===============================================");

        Kapal k = new Kapal("Kapal", "15515020112", "Galangan", "Merah");
        System.out.println("");
        k.display();
        k.getOperasi();
        k.getBahanBakar();
        System.out.println("===============================================");

        Pesawat pes = new Pesawat("Pesawat", "15515020113", "Dirgantara", "Silver");
        System.out.println("");
        pes.display();
        pes.getOperasi();
        pes.getBahanBakar();
        System.out.println("================================================");
    }

}
