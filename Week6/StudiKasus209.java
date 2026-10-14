package Week6;
import java.util.Scanner;
public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPKM;
        int kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = input.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. "
                        + "Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : PKM tidak lolos pendanaan. "
                        + "Dana penghargaan tidak diberikan.");
            }

        } else {

            System.out.println("Status : Kegiatan lainnya tidak memperoleh "
                    + "dana penghargaan.");
        }

        input.close();
    }
}