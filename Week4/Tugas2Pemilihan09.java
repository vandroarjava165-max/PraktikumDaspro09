package Week4;
import java.util.Scanner;
public class Tugas2Pemilihan09 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah SKS yang diambil:");
        int jumlahSks = sc.nextInt();
        if (jumlahSks <= 24){
            System.out.println("Jumlah SKS yang diambil: " + jumlahSks);
            System.out.println("KRS valid");
        } else {
            System.out.println("Jumlah SKS yang diambil: " + jumlahSks);
            System.out.println("Melebihi batas");
        }
    }
}
