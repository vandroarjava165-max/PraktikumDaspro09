public class ContohVariabel09 {
    public static void main(String[] args) {
        String Hobi = "Berenang";
        boolean isPandai = true;
        char jeniskelamin = 'L';
        byte Umur= 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println("Hobi: " + Hobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jeniskelamin);
        System.out.println("Umurku saat ini: " + Umur);
        System.out.println(String.format("Ipk saya %s, dengan tinggi badan %s", ipk, tinggi));
    }
}