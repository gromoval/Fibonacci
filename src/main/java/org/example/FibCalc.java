package org.example;

public class FibCalc {
    public long calc(long i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return calc(i - 1) + calc(i - 2);
    }
}
