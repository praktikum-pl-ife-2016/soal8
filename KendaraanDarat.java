public class KendaraanDarat implements Kendaraan1, Komponen {
private String nama,nomorProduksi,manufaktur,warna;
 
public KendaraanDarat(String nm, String np, String wa, String ma) {
nama=nm;
nomorProduksi=np;
manufaktur = ma;
warna=wa;
}
    
@Override
public void tampilkanNama() {
System.out.println("Nama            : " +nama);
}

@Override
public void tampilkanNomorProduksi() {
System.out.println("No Produksi     : " + nomorProduksi);
}

@Override
public void tampilkanManufaktur(){
System.out.println("Manufaktur      : "+ manufaktur);
}

@Override
public void tampilkanWarna() {
System.out.println("Warna           : " + warna);
}

public void behaviour() {
System.out.println("Cara beroperasi berjalan di darat");
}
 
@Override
public void fuel() {
System.out.println("Bahan bakar kendaraan tersebut adalah solar atau bensin.");
}
}