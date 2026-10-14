import java.util.Scanner;

public class Modifikasi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gaji pokok: ");
        double gaji = input.nextDouble();

        System.out.print("Tunjangan anak: ");
        double tunjangan = input.nextDouble();

        System.out.print("Jumlah anak: ");
        int anak = input.nextInt();

        double potongan = gaji * 10 / 100;
        double gajiBersih = gaji + (tunjangan * anak) - potongan;

        System.out.println("Gaji bersih = " + gajiBersih);
    }
}