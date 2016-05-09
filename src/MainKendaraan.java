
public class MainKendaraan {

    public static void main(String[] args) {
        Becak B1 = new Becak("Becak", "01113", "Becakbiasa", "Coklat berkarat");
        B1.display();
        B1.getOperasi();
        B1.getBahanBakar();
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
        KapalSelam kapal = new KapalSelam("Kapal", "019", "Astute Class", "Biru laut");
        kapal.display();
        kapal.getOperasi();
        kapal.getBahanBakar();
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
        BalonUdara Balud = new BalonUdara("BalonUdara", "00345", "PT. Lestari", "Pelangi");
        Balud.display();
        Balud.getOperasi();
        Balud.getBahanBakar();
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
    }
}
