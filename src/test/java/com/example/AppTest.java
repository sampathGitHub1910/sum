package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    
     @Test
     public void sumTest(){
        int output = App.sum(1, 3);

        assertEquals(4, output);
     }

     @Test
     public void checkEvenTest(){

        assertFalse(App.checkEven(3));
        assertTrue(App.checkEven(4));
        assertTrue(App.checkEven(14));
     }
}
