
public abstract class KendaraanLaut implements Kendaraan {
    private String nama ;
    private String warna ;
   
    public KendaraanLaut (String nama , String warna ){
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
        System.out.println("Kendaraan Laut beroperasi di Daerah berair");
    }
    
}
