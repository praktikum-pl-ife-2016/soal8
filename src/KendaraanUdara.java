

public abstract class KendaraanUdara implements Kendaraan{
    private String nama ;
    private String warna ;
   
    public KendaraanUdara (String nama , String warna ){
        this.nama = nama;
        this.warna= warna;
    }
    public String getNama(){
        return nama;
    }
    public String getWarna(){
        return warna;
    }
    public abstract void bahanBakar();
    public abstract void alatGerak();
    
    @Override
    public void tempatBeroperasi() {
        System.out.println("Kendaraan Udara beroperasi di ruang terbuka Luas");
    }

   
}
