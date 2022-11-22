package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void calculateWaterBill(){
        assertEquals(22.74, App.calculateWaterBill(1800), 0);
        assertEquals(22.74, App.calculateWaterBill(2244), 0);
        assertEquals(26.64, App.calculateWaterBill(2245), 0);
        assertEquals(46.14, App.calculateWaterBill(6000), 0);
    }

    // @Test
    // public void shouldAnswerWithTrue() {
    // assertTrue(App.isEven(4));
    // assertTrue(App.isEven(2));
    // assertTrue(App.isEven(-4));
    // assertTrue(App.isEven(-2));
    // assertTrue(App.isPasswordComplex("12zsaD"));
    // assertTrue(App.isPasswordComplex("ddzs3aD"));
    // assertTrue(App.isPasswordComplex("ddzDsa2"));
    // assertTrue(App.isPasswordComplex("3zsaDf"));
    // }

    // @Test
    // public void shouldAnswerWithFalse() {
    // assertFalse(App.isEven(1));
    // assertFalse(App.isEven(3));
    // assertFalse(App.isEven(-1));
    // assertFalse(App.isEven(-23));
    // assertFalse(App.isPasswordComplex("12zaD"));
    // assertFalse(App.isPasswordComplex("ddzsdaD"));
    // assertFalse(App.isPasswordComplex("ddzsa1"));
    // assertFalse(App.isPasswordComplex("ALLUPPER1"));
    // }
}
