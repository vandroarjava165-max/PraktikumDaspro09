package Week5;
import java.util.Scanner;
public class sistemdiskontokobuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenis = input.nextLine().trim().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        int jumlah = input.nextInt();

        double hargaPerBuku = 50000;
        double totalSebelumDiskon = hargaPerBuku * jumlah;
        double diskonPersen = 0;
        double jumlahDiskon = 0;
        double totalSetelahDiskon = totalSebelumDiskon;

        if (jenis.equals("kamus")) {
            if (jumlah > 2) {
                diskonPersen = 0.10 + 0.02;
            } else {
                diskonPersen = 0.10;
            }
        } else if (jenis.equals("novel")) {
            if (jumlah > 3) {
                diskonPersen = 0.07 + 0.02;
            } else {
                diskonPersen = 0.07 + 0.01;
            }
        } else {
            if (jumlah > 3 && !jenis.equals("kamus") && !jenis.equals("novel")) {
                diskonPersen = 0.05;
            }
        }

        jumlahDiskon = totalSebelumDiskon * diskonPersen;
        totalSetelahDiskon = totalSebelumDiskon - jumlahDiskon;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jenis buku      : " + jenis);
        System.out.println("Jumlah buku     : " + jumlah);
        System.out.println("Total harga    : Rp " + totalSebelumDiskon);
        System.out.println("Diskon         : " + (diskonPersen * 100) + "%");
        System.out.println("Jumlah diskon  : Rp " + jumlahDiskon);
        System.out.println("Total bayar    : Rp " + totalSetelahDiskon);

        input.close();
    }
}
 