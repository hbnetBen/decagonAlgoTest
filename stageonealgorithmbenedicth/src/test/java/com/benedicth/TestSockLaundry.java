package com.benedicth;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestSockLaundry {

    @Test
    public void test1() throws Exception {
        Integer numberMachineCanWash = 0;
        Integer[] cleanPile = { 1, 2, 1, 1 };
        Integer[] dirtyPile = { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(1, pairs);
    }

    @Test
    public void test2() {
        Integer numberMachineCanWash = 2;
        Integer[] cleanPile = { 1, 2, 1, 1 };
        Integer[] dirtyPile = { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(3, pairs);
    }

    @Test
    public void test4() {
        Integer numberMachineCanWash = 3;
        Integer[] cleanPile = { 1, 2, 1, 1 };
        Integer[] dirtyPile = { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(3, pairs);
    }

    @Test
    public void test5() {
        Integer numberMachineCanWash = 2;
        Integer[] cleanPile = { 1, 2, 3, 1, 2, 3 };
        Integer[] dirtyPile = { 3, 3, 4, 1, 2, 7, 9 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(4, pairs);
    }

    @Test
    public void test6() {
        Integer numberMachineCanWash = 4;
        Integer[] cleanPile = { 1, 1, 1, 1, 1, 1 };
        Integer[] dirtyPile = { 1, 2, 2, 1, 3, 4, 5, 2 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(5, pairs);
    }

    @Test
    public void test7() {
        Integer numberMachineCanWash = 0;
        Integer[] cleanPile = { 1 };
        Integer[] dirtyPile = { 1, 2, 3, 4, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(0, pairs);
    }

    @Test
    public void test8() {
        Integer numberMachineCanWash = 20;
        Integer[] cleanPile = { 50, 50, 50, 37, 38, 37, 49, 39, 38, 45, 43 };
        Integer[] dirtyPile = { 50 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(4, pairs);
    }

    @Test
    public void test9() {
        Integer numberMachineCanWash = 20;
        Integer[] cleanPile = { 1 };
        Integer[] dirtyPile = { 50, 50, 50, 37, 38, 37, 49, 39, 38, 45, 43 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(3, pairs);
    }

    @Test
    public void test10() {
        Integer numberMachineCanWash = 50;
        Integer[] cleanPile = { 40, 40, 40, 40, 40, 40, 40, 50, 50, 50, 50, 50 };
        Integer[] dirtyPile = { 40, 40, 45, 45, 30, 35, 50, 50, 25, 25, 20, 20 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(10, pairs);
    }

    @Test
    public void test11() {
        Integer numberMachineCanWash = 1;
        Integer[] cleanPile = { 8 };
        Integer[] dirtyPile = { 8 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(1, pairs);

    }

    @Test
    public void test12() {
        Integer numberMachineCanWash = 20;
        Integer[] cleanPile = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] dirtyPile = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(0, pairs);

    }

    @Test
    public void test13() {
        Integer numberMachineCanWash = 20;
        Integer[] cleanPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        Integer[] dirtyPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(10, pairs);

    }

    @Test
    public void test14() {
        Integer numberMachineCanWash = 20;
        Integer[] cleanPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        Integer[] dirtyPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(10, pairs);

    }

    @Test
    public void test15() {
        Integer numberMachineCanWash = 0;
        Integer[] cleanPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        Integer[] dirtyPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(5, pairs);

    }

    @Test
    public void test16() {
        Integer numberMachineCanWash = 30;
        Integer[] cleanPile = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
        Integer[] dirtyPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(6, pairs);

    }

    @Test
    public void test17() {
        Integer numberMachineCanWash = 4;
        Integer[] cleanPile = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
        Integer[] dirtyPile = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(2, pairs);

    }

    @Test
    public void test18() {
        Integer numberMachineCanWash = 5;
        Integer[] cleanPile = { 1, 2, 3, 2, 3, 4, 5 };
        Integer[] dirtyPile = { 2, 1, 1, 1, 3, 3, 3, 4, 4, 4, 5, 5, 6, 5, 7, 5, 6 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        assertEquals(6, pairs);

    }


}
