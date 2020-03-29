package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFibMyTDD {
    @DataProvider(parallel = true)
    public static Object[][] data() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 55},
                {50, 12586269025L},
                {-50, -12586269025L},
                {-3, 2},
                {-10, -55},
        };
    }

    @Test(dataProvider = "data", timeOut = 40)
    public void testFibMyTDD(int n, long expect) {
        FibCalcMyTDD fibCalcMyTDD = new FibCalcMyTDD();
        long calc_matrix = fibCalcMyTDD.matrix(n);
//        long calc_bine = fibCalcMyTDD.bine(n);
        Assert.assertEquals(calc_matrix, expect, "По формуле возведения матрицы в степень результаты не совпадают");
        System.out.println(n+" элемент последовательности Фибоначчи по методу возведения матрицы в степень: "+calc_matrix);
//        Assert.assertEquals(calc_bine, expect, "По формуле Бине результаты не совпадают");
//        System.out.println(n+" элемент последовательности Фибоначчи по формуле Бине: "+calc_bine);
    }
}
