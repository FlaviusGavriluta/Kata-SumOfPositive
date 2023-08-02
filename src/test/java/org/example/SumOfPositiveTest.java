package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfPositiveTest {
    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive.sumOfPositives(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, SumOfPositive.sumOfPositives(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, SumOfPositive.sumOfPositives(new int[]{}));
        assertEquals(0, SumOfPositive.sumOfPositives(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, SumOfPositive.sumOfPositives(new int[]{-1, 2, 3, 4, -5}));
    }
}