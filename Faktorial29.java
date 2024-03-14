public class Faktorial29 {
    public int nilai;

    public Faktorial29(int nilai) {
        this.nilai = nilai;
    }

    public long faktorialBF(int n) {
        long startTime = System.nanoTime();
        
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Waktu eksekusi faktorialBF: " + duration + " nano detik");
        
        return fakto;
    }

    public long faktorialDC(int n) {
        long startTime = System.nanoTime();
        
        long result = faktorialDCHelper(n);
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Waktu eksekusi faktorialDC: " + duration + " nano detik");
        
        return result;
    }

    private long faktorialDCHelper(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * faktorialDCHelper(n - 1);
        }
    }
}
