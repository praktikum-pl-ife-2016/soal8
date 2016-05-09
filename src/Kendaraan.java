

interface Kendaraan {

    public void Nama();

    public void Prod();

    public void Manufak();

    public void Warna();

    public void Operasi();

    public void BahanBakar();

    public class Main{
        public static void main(String[] args){
            Pesawat p = new Pesawat("Pesawat","777","Boeing","Putih");
            p.Nama();
            p.Prod();
            p.Manufak();
            p.Operasi();
            p.BahanBakar();
            Tank t = new Tank("Tank","3645","Blitzen","Camo");
            t.Nama();
            t.Prod();
            t.Manufak();
            t.Operasi();
            t.BahanBakar();
            JetSki j = new JetSki("JetSki","1337","Honda","Hitam");
            j.Nama();
            j.Prod();
            j.Manufak();
            j.Operasi();
            j.BahanBakar();
        }
    }
}
