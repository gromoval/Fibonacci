package org.example;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestFib {
    @Test
    public void testFib() {
        FibCalc fibCalc = new FibCalc();
        Assert.assertEquals(fibCalc.calc(9), 34, "Неправильный ответ");
    }
}
