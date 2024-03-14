public class Akar29 {
    public static int akarBF(int bilangan) {
        int i = 0;
        while (i * i <= bilangan) {
            i++;
        }
        return i - 1;
    }

    public static int akarDC(int bilangan, int batasBawah, int batasAtas) {
        if (batasBawah == batasAtas) {
            if (batasBawah * batasBawah > bilangan) {
                return batasBawah - 1;
            } else {
                return batasBawah;
            }
        } else {
            int tengah = (batasBawah + batasAtas) / 2;
            if (tengah * tengah == bilangan) {
                return tengah;
            } else if (tengah * tengah > bilangan) {
                return akarDC(bilangan, batasBawah, tengah - 1);
            } else {
                return akarDC(bilangan, tengah + 1, batasAtas);
            }
        }
    }
}
