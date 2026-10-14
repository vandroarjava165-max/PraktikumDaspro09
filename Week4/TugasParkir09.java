package Week4;
import java.util.Scanner;
public class TugasParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan lama parkir (jam): ");
        int jam = sc.nextInt();
        int tarif;
        if(jam <= 2){
            tarif = 2000;
        }else{    
            tarif = 2000 + (jam - 2) * 1000;
            System.out.println("Total tarif parkir:Rp " + tarif);
        }
    }
}
