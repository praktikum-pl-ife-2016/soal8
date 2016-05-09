public class KapalBoot extends KendaraanLaut {

    public KapalBoot(String nama, String warna) {
        super(nama, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Kapal Boot berbahan bakar solar");
    }

    @Override
    public void alatGerak() {
        System.out.println("Kapal Boot bergerak menggunakan turbin mesin");
    }
     public void tampilan(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Warna : "+ super.getWarna());
        bahanBakar();
        alatGerak();
        super.tempatBeroperasi();
         System.out.println("-------------------------------------------");
    }
    
}
