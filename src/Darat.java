public abstract class Darat implements Kendaraan {
     String nama, nomor, manufaktur, warna, bahanBakar;
     @Override
    public void Nama(String nama){
    this.nama = nama;
    }
     @Override
    public void Nomor(String nomor){
    this.nomor = nomor;
    }
     @Override
    public void Manufaktur(String manufaktur){
    this.manufaktur = manufaktur;
    }
     @Override
    public void Warna(String warna){
    this.warna = warna;
    }
    @Override
    public void bahanBakar(String bahanBakar) {
         this.bahanBakar = bahanBakar;
    }
    @Override
    public String caraOperasi(){
         return "Beroperasi di darat dengan roda";
    }
    public abstract void display();
      
}
