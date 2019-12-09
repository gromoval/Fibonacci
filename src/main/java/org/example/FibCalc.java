package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibCalc {
    private Logger log = LogManager.getLogger();

    public long calc(long i) {
//        log.trace("Считаем число Фибоначчи: {}", i);
/*        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            log.error(e);
        }*/
        if (i < 0 || i > 50) throw new IllegalArgumentException("Мы не считаем значения меньше 0 или больше 50!");
        if (i == 0) return 0;
        if (i == 1) return 1;
        return calc(i - 1) + calc(i - 2);
    }
}
