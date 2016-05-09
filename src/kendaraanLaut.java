package soalpraktikum8;
public abstract class kendaraanLaut implements Kendaraan {
    
    private String nama, warna,manufaktur, noProd;
   
    public kendaraanLaut (String nama, String manufaktur, String no, String warna) {
        this.nama = nama;
        this.manufaktur = manufaktur;
        this.noProd = no;
        this.warna = warna;
    }
    public String getNama(){
        return nama;
    }
    public String getManufaktur(){
        return manufaktur;
    }
    public String getNo(){
        return noProd;
    }
    public String getWarna(){
        return warna;
    }
    
    public abstract void bahanBakar();    

    public void beroperasi() {
        System.out.println("Kendaraan Laut beroperasi di daerah perairan laut");
   }
    
}
    

