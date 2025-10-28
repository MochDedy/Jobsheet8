import java.util.Scanner;

public class Tugas3Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, cabang, totSemuPel, totSemItem, pelanggan, totItemCabang, item;

        System.out.print("Masukkan jumlah cabang Kafe: ");
        cabang = sc.nextInt();

        totSemuPel = 0;
        totSemItem = 0;

        System.out.println("\n==== Input Penjualan Setiap Cabang ====");

        for (i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            pelanggan = sc.nextInt();
            totSemuPel += pelanggan;

            totItemCabang = 0;

            for (j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item: ");
                item = sc.nextInt();
                totItemCabang += item;
            }
            System.out.println("Cabang " + i + ": " );
            System.out.println("- Pelanggan: " +pelanggan + " orang" );
            System.out.println("- Item terjual: " +totItemCabang);
            totSemItem += totItemCabang;
        }

        System.out.println("\nTotal seluruh cabang: " +cabang + " Cabang");
        System.out.println("Pelanggan " +totSemuPel + " orang");
        System.out.println("Item terjual: " +totSemItem + " item");
    }
}
