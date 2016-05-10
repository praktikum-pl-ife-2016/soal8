package kendaraan;
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        KendaraanLaut kl = new KendaraanLaut("Kapal Selam", "1234", "Putih", "Hyundai");
        kl.tampilkanNama();
        kl.tampilkanNoprod();
        kl.tampilkanWarna();
        kl.tampilkanManufaktur();
        kl.perilaku();
        kl.bahanbakar();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("-----------------------------------");
        KendaraanDarat kd = new KendaraanDarat("Mobil", "4321", "Hijau", "B EM WE");
        kd.tampilkanNama();
        kd.tampilkanNoprod();
        kd.tampilkanWarna();
        kd.tampilkanManufaktur();
        kd.perilaku();
        kd.bahanbakar();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("-----------------------------------");
        KendaraanUdara ku = new KendaraanUdara("Pesawat", "3290", "Merah", "Boeing");
        ku.tampilkanNama();
        ku.tampilkanNoprod();
        ku.tampilkanWarna();
        ku.tampilkanManufaktur();
        ku.perilaku();
        ku.bahanbakar();
        System.out.println("-----------------------------------");
        
    }
}
