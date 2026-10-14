import java.util.Scanner;
public class Studi2Kasus09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xlembar;
        double biayaCetakPerlembar=500;
        double biayajilid=5000;
        double totalBiaya;
        System.out.print("Masukkan jumlah lembar yang dicetak: ");
        xlembar = sc.nextInt();
        totalBiaya = (biayaCetakPerlembar * xlembar) + biayajilid;
        System.out.println("Total biaya yang harus diabayar adalah Rp. " + totalBiaya);
    }
}