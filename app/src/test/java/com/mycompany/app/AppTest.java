package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int k=0;
        for (int i=1; i<2000000000000; i++) {
            k=k+(1%i);
        }
        System.out.println(k);
    }
}
