package soalpraktikum8;

public class keretaApi extends kendaraanDarat {

   public keretaApi (String nama, String manufaktur, String no, String warna) {
        super(nama, manufaktur, no, warna);
    }

    public void bahanBakar() {
        System.out.println("Kereta Api berbahan bakar Batubara");
   }

     public void tampilan(){
        System.out.println("Nama         : "+super.getNama());
        System.out.println("Manufaktur   : "+super.getManufaktur());
        System.out.println("No Produksi  : "+super.getNo());
        System.out.println("Warna        : "+super.getWarna());
        bahanBakar();
        super.beroperasi();
         System.out.println("==================================================");

}
}
