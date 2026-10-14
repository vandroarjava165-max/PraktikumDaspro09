package Week4;
import java.util.Scanner;
public class PemilihanIf09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT lunas? (TRUE/FALSE): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else{
            System.out.println("Registasi ditolak, Silahkan lunasi UKT terlebih dahulu");
        }
        }
    }

