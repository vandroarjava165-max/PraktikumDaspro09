public class Studi1Kasus09 {
    public static void main(String[] args) {
        int gaji_pokok = 5000000;
        int jumlah_anak = 4;
        int tunjangan_anak = 100000;
        double potongan = 0.10;

        int total_tunjangan = jumlah_anak * tunjangan_anak;
        double potongan_pensiun = gaji_pokok * potongan;
        double gaji_bersih = gaji_pokok + total_tunjangan - potongan_pensiun;

        System.out.println("Gaji bersih = Rp" + gaji_bersih);

    }
}
