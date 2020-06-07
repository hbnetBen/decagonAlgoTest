package com.benedicth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestApp {

    App app = null;
    Integer noOfWashes = 0;

    @Before
    public void setUp(){
        app = new App();
    }

    @Before
    public void initTest() {
        noOfWashes = 3;
    }

    @Test
    public void shouldAnswerTrueIfNoOfWashesIsWithinRangeZeroAndFifty()
    {
        assertTrue( (noOfWashes >= 0) && (noOfWashes <= 50));
    }


    @Test
    public  void testMaxNumberPairsShouldReturnMaxPairs(){
        Integer expect = 5;
        assertEquals(expect,app.maxNumberPairs(noOfWashes,new Integer[]{1, 3, 2, 4, 3, 1, 2, 1, 1},new Integer[]{1, 4, 3, 1, 5, 9, 10, 9, 3, 2, 4}));
    }

}
