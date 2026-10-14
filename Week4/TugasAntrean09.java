package Week4;
import java.util.Scanner;
public class TugasAntrean09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MESIN ANTRIAN AKADEMIK===");
        System.out.println("1.Layanan Akademik");
          System.out.println("2. Layanan Keuangan");
        System.out.println("3. Layanan Kemahasiswaan");
        System.out.println("4. Layanan Administrasi");
        System.out.print("Pilih layanan (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Antrean Layanan Akademik");
                break;

            case 2:
                System.out.println("Antrean Layanan Keuangan");
                break;

            case 3:
                System.out.println("Antrean Layanan Kemahasiswaan");
                break;

            case 4:
                System.out.println("Antrean Layanan Administrasi");
                break;

            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        sc.close();
    }
}