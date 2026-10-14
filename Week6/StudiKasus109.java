package Week6;
import java.util.Scanner;
public class StudiKasus109 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        // Menghitung total harga
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        
        // Total yang harus dibayar
        totalBayar = totalHarga - diskon;

        // Output
        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        // Cek uang pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();
    }
}