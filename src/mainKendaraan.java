package soalpraktikum8;

public class mainKendaraan {

    public static void main(String[] args) {
        pesawatTerbang pesawat = new pesawatTerbang("Garuda Indonesia", "garuda", "1234", "putih biru");
        keretaApi kereta = new keretaApi("Kertajaya", "INKA", "2134", "Coklat");
        kapalFeri kapal = new kapalFeri("RMS Titanic", "PAL", "3456", "Hitam");
        pesawat.tampilan();
        kereta.tampilan();
        kapal.tampilan();
    }
}
