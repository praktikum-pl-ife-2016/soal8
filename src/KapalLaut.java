
package kendaraan;

public class KapalLaut extends KendaraanLaut {
    public KapalLaut(String nama, int noProduksi, String manufaktur, String warna, String bahanBakar) {
        super(nama, manufaktur, noProduksi,  warna, bahanBakar);
    }

    

    

    @Override
    public void nama() {
        System.out.println(getNama());
    }

    @Override
    public void noProduksi() {
        System.out.println(getNoProduksi());
    }

    @Override
    public void manufaktur() {
        System.out.println(getManufaktur());
    }

    @Override
    public void warna() {
        System.out.println(getWarna());
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bahan bakar yang digunakan adalah " + bahanBakar);
    }

}
