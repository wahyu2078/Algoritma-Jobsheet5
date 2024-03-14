import java.util.Scanner;

public class AkarMain29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        int akarBF = Akar29.akarBF(bilangan);
        System.out.println("Akar dengan Brute Force: " + akarBF);

        int akarDC = Akar29.akarDC(bilangan, 0, bilangan);
        System.out.println("Akar dengan Divide and Conquer: " + akarDC);
    }
}
