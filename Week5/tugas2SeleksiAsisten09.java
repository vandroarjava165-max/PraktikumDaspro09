package Week5;
import java.util.Scanner;
public class tugas2SeleksiAsisten09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String status, sanksi, sertifikat;
        int nilai, wawancara;
        System.out.print("Status mahasiswa (aktif/tidak aktif): ");
        status = input.nextLine();
        System.out.print("Sedang mendapat sanksi akademik? (ya/tidak): ");
        sanksi = input.nextLine();
        System.out.print("Nilai Dasar Pemrograman: ");
        nilai = input.nextInt();
        input.nextLine();
        System.out.print("Memiliki sertifikat kompetensi pemrograman? (ya/tidak): ");
        sertifikat = input.nextLine();

        if (status.equalsIgnoreCase("aktif") && 
            sanksi.equalsIgnoreCase("tidak")) {

            if (nilai >= 80 || sertifikat.equalsIgnoreCase("ya")) {
                System.out.println("Memenuhi syarat tahap 2.");
                System.out.println("Silakan mengikuti wawancara.");
                System.out.print("Nilai wawancara: ");
                wawancara = input.nextInt();

                if (wawancara >= 75) {
                    System.out.println("Selamat, Anda diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal pada tahap wawancara.");
                    System.out.println("Alasan: Nilai wawancara kurang dari 75.");
                }

            } else {
                System.out.println("Gagal pada tahap 2.");
                System.out.println("Alasan: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("Gagal pada tahap 1.");

            if (!status.equalsIgnoreCase("aktif") && 
                sanksi.equalsIgnoreCase("ya")) {
                System.out.println("Alasan: Status mahasiswa tidak aktif dan sedang mendapat sanksi akademik.");
            } else if (!status.equalsIgnoreCase("aktif")) {
                System.out.println("Alasan: Status mahasiswa tidak aktif.");
            } else {
                System.out.println("Alasan: Sedang mendapat sanksi akademik.");
            }
        }

        input.close();
    }
}