package org.example;

// интересные результаты дает испольвование BigInteger. будет вычислять, пока память на "машине" не закончится. Можно посмотреть, как выглядит 1000й элемент
// есть интересные алгоритмы https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D1%8B_%D0%B1%D1%8B%D1%81%D1%82%D1%80%D0%BE%D0%B3%D0%BE_%D0%B2%D0%BE%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F_%D0%B2_%D1%81%D1%82%D0%B5%D0%BF%D0%B5%D0%BD%D1%8C
// но мы их использовать не будем, до 50 наc устроит и без
public class FibCalcMyTDD {
    public long matrix(int n) {
        int initn =n;
        n=Math.abs(n);
        if (n > 50) throw new IllegalArgumentException("Мы не считаем значения больше 50!");
        if (n == 0) return 0;
        if (n == 1) return 1;

        long F[][] = new long[][] {{1,1},{1,0}};
        long M[][] = new long[][] {{1,1},{1,0}};

        // возводим в n-1 cтепень
        for (int i = 2; i <n ; i++) {
            long x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
            long y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
            long z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
            long w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
            F[0][0] = x;
            F[0][1] = y;
            F[1][0] = z;
            F[1][1] = w;
        }

        if (initn<0) {
            return (long) (Math.pow(-1,initn+1)*F[0][0]);
        } else return F[0][0];
    }

// можем считать только для положительных, поэтому не будем дальше использовать
    public long bine(int n) {
        if (n < 0 || n > 50) throw new IllegalArgumentException("Мы не считаем значения меньше 0 или больше 50!");
        double value = Math.pow(5, 0.5);
        double one = (1 + value) / 2;
        double two = (1 - value) / 2;
        return Math.round((Math.pow(one, n) - Math.pow(two, n)) / value);
    }
}
