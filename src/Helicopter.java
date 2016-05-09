public class Helicopter extends KendaraanUdara {

    public Helicopter(String nama, String warna) {
        super(nama, warna);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Helicopter berbahan bakar aftur");
    }

    @Override
    public void alatGerak() {
        System.out.println("Helicopter bergerak menggunakan Balng baling");
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
