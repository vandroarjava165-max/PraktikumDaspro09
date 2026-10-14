public class RobotArm10{
        // Kondisi awal
    public static void main(String[] args) {
        String nampanA = "Bola Bintang";
        String nampanB = "Bola Bulan";
        String nampanC = "Kosang";
        // Langkah 1
        nampanC = nampanA;
        nampanA = "Kosong";
        System.out.println("Setelah Langkah 1: Nampan A = " + nampanA + ", Nampan B = " + nampanB + "Nampan C = " + nampanC);
        // Langkah 2
        nampanA = nampanB;
        nampanB = "Kosong";
        System.out.println("Setelah Langkah 2: Nampan A = " + nampanA +", Nampan B = " + nampanB +", Nampan C = " + nampanC);
        // Langkah 3
        nampanB = nampanC;
        nampanC = "Kosong";
        System.out.println("Setelah Langkah 3: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);
        System.out.println("Kesimpulan: Pernyataan yang benar adalah (a) dan (e).");
    }
}