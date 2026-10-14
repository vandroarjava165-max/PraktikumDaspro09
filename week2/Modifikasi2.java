import java.util.Scanner;

public class Modifikasi2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah (m): ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar tanah (m): ");
        int lebar = input.nextInt();
        System.out.print("Masukkan diameter kolam (m): ");
        int diameter = input.nextInt();
        System.out.print("Masukkan sisi panjang taman (m): ");
        int sisi = input.nextInt();

        int luastanah = panjang * lebar;
        double jarijari = diameter / 2.0;
        double luaskolam = Math.PI * jarijari * jarijari;

        int luastaman = sisi * sisi;
        double luastidakdigunakan = luastanah - luaskolam - luastaman;
        System.out.println("Luas tanah yang tidak digunakan = " + luastidakdigunakan + " m2 ");
    }
}