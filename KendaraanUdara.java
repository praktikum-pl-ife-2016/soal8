public class KendaraanUdara implements Kendaraan1, Komponen {
private String nama;
private String nomorProduksi;
private String manufaktur;
private String warna;
 
public KendaraanUdara(String nm, String np, String wa, String ma) {
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
System.out.println("Cara beroperasi terbang di udara");
}
 
@Override
public void fuel() {
System.out.println("Bahan bakar kendaraan tersebut adalah kerosine atau avtur.");
}
}
    

