public class Main {
public static void main(String[] args) {
System.out.println("=========================================================================");
KendaraanLaut M1 = new KendaraanLaut("Kapal","2522","Hitam","Yamaha");
M1.tampilkanNama();
M1.tampilkanNomorProduksi();
M1.tampilkanManufaktur();
M1.tampilkanWarna();
M1.behaviour();
M1.fuel();
System.out.println("=========================================================================");


KendaraanUdara R1 = new KendaraanUdara("Pesawat","1477","Putih","Boieng");
R1.tampilkanNama();
R1.tampilkanNomorProduksi();
R1.tampilkanManufaktur();
R1.tampilkanWarna();
R1.behaviour();
R1.fuel();
System.out.println("=========================================================================");

KendaraanDarat T1 = new KendaraanDarat("Mobil","4230","Abu-Abu","Toyota");
T1.tampilkanNama();
T1.tampilkanNomorProduksi();
T1.tampilkanManufaktur();
T1.tampilkanWarna();
T1.behaviour();
T1.fuel();
System.out.println("=========================================================================");
}
}


