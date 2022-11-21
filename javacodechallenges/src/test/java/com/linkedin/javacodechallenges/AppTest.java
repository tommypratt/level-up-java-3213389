package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(App.IsEven(4));
        assertTrue(App.IsEven(2));
        assertTrue(App.IsEven(-4));
        assertTrue(App.IsEven(-2));
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(App.IsEven(1));
        assertFalse(App.IsEven(3));
        assertFalse(App.IsEven(-1));
        assertFalse(App.IsEven(-23));
    }
}
