
public class Mobil extends KendaraanDarat {

    public Mobil(String nama, String warna) {
        super(nama, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Mobil Berbahan Bakar Pertamax");
    }

    @Override
    public void alatGerak() {
        System.out.println("Mobil bergerak menggunakan roda karet");
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
