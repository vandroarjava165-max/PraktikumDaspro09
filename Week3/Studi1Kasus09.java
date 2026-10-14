import java.util.Scanner;
public class Studi1Kasus09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Rpx;
        int Rpy;
        int z;
        double bunga = 0.02;
        System.out.print("Masukkan Harga laptop: ");
        Rpx = sc.nextInt();
        System.out.print("Masukkan Uang Muka: ");
        Rpy = sc.nextInt();
        System.out.print("Masukkan jumlah angsuran: ");
        z = sc.nextInt();
        double total = Rpx - Rpy;
        double angsuran = total / z;
        double totalBunga = bunga * total;
        double totalBayar = total + totalBunga;
        System.out.println("Total angsuran yang harus dibayar adalah: " + totalBayar);
        System.out.println("Angsuran bulanan adalah: " + angsuran);
    }
}