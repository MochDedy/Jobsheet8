import java.util.Scanner;

public class Square14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
