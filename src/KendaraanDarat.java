

package mainkendaraan;

public class KendaraanDarat implements Kendaraan{
    private String nama,no,jenis,warna;
    
    public KendaraanDarat (String nama,String no,String jenis,String warna){
        this.nama=nama;
        this.no=no;
        this.jenis=jenis;
        this.warna=warna;
    }

    @Override
    public void nama() {
        System.out.println("Nama :"+this.nama);
    }

    @Override
    public void no() {
        System.out.println("No prod :"+this.no);
    }

    @Override
    public void jenis() {
        System.out.println("Manufaktur :"+this.jenis);
    }

    @Override
    public void warna() {
        System.out.println("Warna :"+this.warna);
    }

    @Override
    public void cara() {
        System.out.println("cara beroprasi berjalan di darat");
    }

    @Override
    public void bahanBakar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
