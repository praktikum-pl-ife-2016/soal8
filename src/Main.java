package Tugas8;

public class Main {

    public static void main(String[] args) {
        Tank t = new Tank("Tank", "1201AA", "Pindad", "Hijau");
        KapalSelam k = new KapalSelam("Kapal Selam", "1201AB", "Pindad", "Hitam");
        Jet j = new Jet("Jet", "1201AC", "Pindad", "Silver");
        System.out.println("-------------------------------------------------");
        t.nama();
        t.nomor();
        t.manufaktur();
        t.warna();
        t.caraOperasi();
        t.bahanBakar();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        k.nama();
        k.nomor();
        k.manufaktur();
        k.warna();
        k.caraOperasi();
        k.bahanBakar();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        j.nama();
        j.nomor();
        j.manufaktur();
        j.warna();
        j.caraOperasi();
        j.bahanBakar();
        System.out.println("-------------------------------------------------");
    }
}
