import java.util.Scanner;
 
public class TugasBioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlah, totalTiket = 0;
        double bayar, totalPenjualan = 0;
 
        System.out.println("Penjualan tiket bioskop (masukkan 0 untuk mengakhiri hari)");
        while (true) {
            System.out.print("Jumlah tiket yang dibeli pelanggan: ");
            jumlah = sc.nextInt();
            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }
            bayar = (double) jumlah * HARGA_TIKET;
            if (jumlah > 10) {
                bayar = bayar * 0.85;   // diskon 15%
            } else if (jumlah > 4) {
                bayar = bayar * 0.90;   // diskon 10%
            }
            totalTiket += jumlah;
            totalPenjualan += bayar;
            System.out.println("Total bayar pelanggan: Rp " + (long) bayar);
        }
 
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + (long) totalPenjualan);
        sc.close();
    }
}