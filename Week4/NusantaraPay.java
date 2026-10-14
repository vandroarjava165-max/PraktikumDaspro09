package Week4;
import java.util.Scanner;
public class NusantaraPay {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Status akun (BLACK-LISTED/SUSPICIOUS/NORMAL): ");
        String status = sc.nextLine();

        System.out.print("Saldo tersedia: ");
        double saldo = sc.nextDouble();

        System.out.print("Jumlah transaksi: ");
        double jumlah = sc.nextDouble();

        System.out.print("Jam transaksi (0-23): ");
        int jam = sc.nextInt();

        System.out.print("Transaksi dari luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();

        String hasil;

        if (status.equals("BLACK-LISTED")) {
            hasil = "REJECTED_BLACKLIST";
        } 
        else if (jumlah > saldo) {
            hasil = "REJECTED_SALDO";
        } 
        else if (jumlah > 10000) {
            hasil = "REJECTED_LIMIT";
        } 
        else if (isBedaNegara && jumlah > 2000) {
            hasil = "FLAGGED_FRAUD";
        } 
        else if (jam >= 0 && jam <= 4 && jumlah > 1000) {
            hasil = "REQUIRE_OTP_NIGHT";
        } 
        else if (status.equals("SUSPICIOUS") && jumlah > 500) {
            hasil = "REQUIRE_OTP_SUSPICIOUS";
        } 
        else {
            hasil = "APPROVED";
        }

        System.out.println("Status transaksi: " + hasil);

        sc.close();
    }
}