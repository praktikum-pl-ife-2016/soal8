public class Main {
    public static void main (String[]args){
        AnakUdara u = new AnakUdara("Drone","12423","yamaha","pink");
        System.out.println("Nama\t\t: "+u.getNama());
        System.out.println("No pro\t\t: "+u.getNoProk());
        System.out.println("Manufaktur\t: "+u.getManu());
        System.out.println("warna\t\t: "+u.getWarna());
        System.out.println("Cara beroperasi "+u.caraOperasi());
        System.out.println("dan bahan bakar "+u.bahanBakar());
    }
}
