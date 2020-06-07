package com.benedicth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestApp {

    App app = null;
    Integer noOfWashes = 0;
    Integer[] cleanPile = {1, 3, 2, 4, 3, 1, 2, 1, 1};
    Integer[] dirtyPile = {1, 4, 3, 1, 5, 9, 10, 9, 3, 2, 4};

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
    public void shouldAnswerTrueIfCleanPileWithinRangeOneAndFifty()
    {
        boolean found = true;
        for (int i = 0; i < cleanPile.length; i++)
        {
            if (cleanPile[ i ]  <= 0 || cleanPile[ i ]  > 50 )
            {
                found = false;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void shouldAnswerTrueIfDirtyPileWithinRangeOneAndFifty()
    {
        boolean found = true;
        for (int i = 0; i < dirtyPile.length; i++)
        {
            if (dirtyPile[ i ]  <= 0 || dirtyPile[ i ]  > 50 )
            {
                found = false;
                break;
            }
        }
        assertTrue(found);
    }


    @Test
    public  void testMaxNumberPairsShouldReturnMaxPairs(){
        Integer expect = 5;
        assertEquals(expect,app.maxNumberPairs(noOfWashes,cleanPile,dirtyPile));
    }

}
