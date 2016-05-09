
public class kelas {
    public static void main(String[] args) {
    kapal b=new kapal();
    pesawat n=new pesawat();
    mobil z=new mobil();
        System.out.println("Nama:"+b.setNama("Kapal feri"));
        System.out.println("No Prod:"+b.setNoprod("2313"));
        System.out.println("Manufaktur:"+b.setManufaktur("ferari"));
        System.out.println("Warna:"+b.setWarna("putih"));
        System.out.println(b.caraBeroperasi());
        System.out.println("");
        System.out.println("Nama:"+n.setNama("boeing 737"));
        System.out.println("No Prod:"+n.setNoprod("4444"));
        System.out.println("Manufaktur:"+n.setManufaktur("boeing"));
        System.out.println("Warna:"+n.setWarna("putih"));
        System.out.println( n.caraBeroperasi());
        System.out.println("");
        System.out.println("Nama:"+z.setNama("Mobil"));
        System.out.println("No Prod:"+z.setNoprod("1113"));
        System.out.println("Manufaktur:"+z.setManufaktur("honda"));
        System.out.println("Warna:"+z.setWarna("merah"));
        System.out.println(z.caraBeroperasi());
    }
}
