public class PesawatTempur extends Udara{
  @Override
     public void display() {
         System.out.println("-------------------");
         System.out.println("Nama : " + nama);
         System.out.println("No Prod. :" + nomor);
         System.out.println("nManufaktur : " + manufaktur);
         System.out.println("Warna : " +warna);
         System.out.println("Bahan bakar yang digunakan adalah "+ bahanBakar);
         System.out.println(caraOperasi());
     }  
}
