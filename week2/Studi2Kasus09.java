public class Studi2Kasus09{
    public static void main(String[] args) {
      int lebar = 30;
      int panjang = 100;
      int diameter = 5;
      int sisi = 2;
      
      int luastanah = panjang * lebar;
      double jarijari = diameter / 2.0;
      double luaskolam = Math.PI * jarijari * jarijari;

      int luastaman = sisi * sisi;
      double luastidakdigunakan = luastanah - luaskolam - luastaman;
      System.out.println("Luas tanah yang  tidak di gunakan = " + luastidakdigunakan + " m2 ");
    }
}
