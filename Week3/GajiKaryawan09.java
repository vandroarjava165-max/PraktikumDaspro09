import java.util.Scanner;
public class GajiKaryawan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTranasportasi=600000;
        double tunjanganMakan=400000;
        System.out.print("Masukkan gaji pokok anda: ");
        gajiPokok = input.nextInt();
        bonus=0.05 * gajiPokok;
        totalGaji = gajiPokok + bonus + tunjanganTranasportasi + tunjanganMakan+bonus-(0.1 * gajiPokok);
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Total Gaji anda adalah Rp. " + (int) totalGaji);
    }
}