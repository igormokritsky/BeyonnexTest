package org.igormokritsky;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.igormokritsky.util.AnagramCheckerUtil;
import org.junit.Test;


public class AppTest {
    @Test
    public void testAnagrams() {
        assertTrue(AnagramCheckerUtil.areAnagrams("listen", "silent"));
        assertTrue(AnagramCheckerUtil.areAnagrams("Astronomer", "Moon starer"));
        assertTrue(AnagramCheckerUtil.areAnagrams("Debit card", "Bad credit"));
    }

    @Test
    public void testNonAnagrams() {
        assertFalse(AnagramCheckerUtil.areAnagrams("hello", "world"));
        assertFalse(AnagramCheckerUtil.areAnagrams("abc", "def"));
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(AnagramCheckerUtil.areAnagrams("listen", "listens"));
        assertFalse(AnagramCheckerUtil.areAnagrams("listen", "liten"));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(AnagramCheckerUtil.areAnagrams("", ""));
    }
}
