package main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestCompetition {

    private Competition comp = new Competition();

    @Test
    public void testFirst() {
        assertTrue("An instance of 1st was formatted incorrectly", comp.pupCompetition(2).contains("1st"));
    }

    @Test
    public void testSecond() {
        assertTrue("An instance of 2nd was formatted incorrectly", comp.pupCompetition(2).contains("2nd"));
    }

    @Test
    public void testThird() {
        assertTrue("An instance of 3rd was formatted incorrectly", comp.pupCompetition(2).contains("3rd"));
    }

    @Test
    public void testTweens() {
        assertTrue(comp.pupCompetition(2).contains("11th"));
        assertTrue(comp.pupCompetition(2).contains("12th"));
        assertTrue(comp.pupCompetition(2).contains("13th"));
    }

    @Test
    public void testPosition() {
        assertFalse("The dog's position was included", (comp.pupCompetition(100).contains("100th")));
        assertFalse("The dog's position was included", (comp.pupCompetition(22).contains("22nd")));
        assertFalse("The dog's position was included", (comp.pupCompetition(10).contains("10th")));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("The input was out of bounds", "invalid number", comp.pupCompetition(-1));
    }
}