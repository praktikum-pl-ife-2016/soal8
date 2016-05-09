

    public class KapalSelam extends KendaraanLaut{
    @Override
    public void Tampilan() {
        System.out.println("----------------------------------------");
        System.out.println("NamaKendaraan      : " + NamaKendaraan);
        System.out.println("NomorKendaraan     : " + NomorProduksiKendaraan);        
        System.out.println("ManufakturKendaraan: " + ManufakturKendaraan);        
        System.out.println("WarnaKedaraan      : " + WarnaKendaraan);        
        System.out.println("Cara beroperasi dengan teggelam di permukaan laut dan melaju dibantu dengan mesin."
                + "\nBahan bakar yang digunakan adalah "+BahanBakarKendaraan);
    }
    
}