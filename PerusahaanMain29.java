import java.util.Scanner;

public class PerusahaanMain29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        
        Perusahaan29[] perusahaan = new Perusahaan29[jumlahPerusahaan];
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan perusahaan " + (i + 1) + ": ");
            int elemen = sc.nextInt();
            perusahaan[i] = new Perusahaan29(elemen);
            
            System.out.println("Masukkan keuntungan per bulan untuk perusahaan " + (i + 1) + ": ");
            for (int j = 0; j < elemen; j++) {
                System.out.print("Bulan " + (j + 1) + ": ");
                perusahaan[i].setKeuntungan(j, sc.nextDouble());
            }
        }

        System.out.println("================================================");
        System.out.println("Total keuntungan perusahaan dengan Brute Force:");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ": " + perusahaan[i].totalBF());
        }

        System.out.println("================================================");
        System.out.println("Total keuntungan perusahaan dengan Divide and Conquer:");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ": " + perusahaan[i].totalDC(0, perusahaan[i].getJumlahBulan() - 1));
        }
        System.out.println("================================================");
    }
}