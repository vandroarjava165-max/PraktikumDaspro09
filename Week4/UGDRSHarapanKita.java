package Week4;
import java.util.Scanner;
public class UGDRSHarapanKita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saturasi oksigen (%): ");
        int spo2 = sc.nextInt();
        
        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Tekanan darah sistolik: ");
        int tekananDarah = sc.nextInt();

        System.out.print("Sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();

        System.out.print("Suhu tubuh: ");
        double suhu = sc.nextDouble();

        System.out.print("Memiliki riwayat komorbiditas? (true/false): ");
        boolean komorbid = sc.nextBoolean();

        System.out.print("Usia: ");
        int usia = sc.nextInt();

        System.out.print("Laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        String ruang;

        if (spo2 < 85 && sisaBedICU > 0) {
            ruang = "ICU";
        }
        else if (spo2 < 85 && sisaBedICU == 0) {
            ruang = "UGD_VENTILATOR_MOBIL";
        }
        else if ((spo2 >= 85 && spo2 <= 89)
                || tekananDarah < 90
                || tekananDarah > 180
                || !sadarPenuh) {
            ruang = "RESUSITASI_UGD";
        }
        else if (((spo2 >= 90 && spo2 <= 94)
                || suhu > 39)
                && komorbid
                && usia >= 65) {
            ruang = "HCU_ISOLASI";
        }
        else if ((spo2 >= 90 && spo2 <= 94)
                || lajuNapas > 24) {
            ruang = "RAWAT_INAP_UMUM";
        }
        else {
            ruang = "RAWAT_JALAN";
        }

        System.out.println("Lokasi perawatan: " + ruang);

        sc.close();
    }
}