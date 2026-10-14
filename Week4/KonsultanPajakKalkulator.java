package Week4;
import java.util.Scanner;
public class KonsultanPajakKalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan PKP (Rp): ");
        double pkp = sc.nextDouble();

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= 60_000_000) {
            pajak = pkp * 0.05;
        } else if (pkp <= 250_000_000) {
            pajak = (60_000_000 * 0.05)
                    + ((pkp - 60_000_000) * 0.15);
        } else if (pkp <= 500_000_000) {
            pajak = (60_000_000 * 0.05)
                    + (190_000_000 * 0.15)
                    + ((pkp - 250_000_000) * 0.25);
        } else {
            pajak = (60_000_000 * 0.05)
                    + (190_000_000 * 0.15)
                    + (250_000_000 * 0.25)
                    + ((pkp - 500_000_000) * 0.30);
        }

        System.out.println("Pajak PPh 21 = Rp" +pajak); 
    }
}