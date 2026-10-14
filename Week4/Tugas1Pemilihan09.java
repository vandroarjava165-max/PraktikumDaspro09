package Week4;
import java.util.Scanner;
public class Tugas1Pemilihan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT lunas? (TRUE/FALSE): ");
        boolean uktLunas = sc.nextBoolean();
        String pesan = uktLunas
        ?"Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tandatangan DPA" 
        : "Registasi ditolak, Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }
}