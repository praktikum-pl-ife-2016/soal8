public abstract class  KendaraanDarat implements Kendaraan {
    private String nama;
    private String noProk;
    private String manufaktur;
    private String warna;
    
    KendaraanDarat(String nama, String noProk, String manufaktur,String warna){
        this.nama = nama;
        this.noProk = noProk;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }
    public String getNama(){
        return nama;
    }
    public String getNoProk(){
        return noProk;
    }
    public String getManu(){
        return manufaktur;
    }
    public String getWarna(){
        return warna;
    }
    public abstract String bahanBakar();
    public String caraOperasi(){
        return "di permukaan tanah";
    }
            
}
