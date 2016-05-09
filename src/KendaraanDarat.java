public abstract class KendaraanDarat implements Kendaraan {

    String name, noProd, manufaktur, warna, caraOperasi, bahanBakar;

    KendaraanDarat(String name, String noProd, String manufaktur, String warna) {
        this.name = name;
        this.noProd = noProd;
        this.manufaktur = manufaktur;
        this.warna = warna;
    }

    @Override
    public abstract void getCaraOperasi();

    @Override
    public abstract void getJenisBahanBakar();

    public void Tampilan() {
        System.out.println("Nama\t\t: " + name);
        System.out.println("No Prod\t\t: " + noProd);
        System.out.println("Manufaktur\t: " + manufaktur);
        System.out.println("Warna\t\t: " + warna);
    }
}
