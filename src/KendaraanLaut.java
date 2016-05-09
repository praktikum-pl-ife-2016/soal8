public abstract class KendaraanLaut implements Kendaraan {
    private String nama,noProduksi,manufaktur,warna;
    public void operasi(){
        System.out.println("Kendaraan ini beroperasi di laut");
    }
    public abstract void bahanBakar();
}
