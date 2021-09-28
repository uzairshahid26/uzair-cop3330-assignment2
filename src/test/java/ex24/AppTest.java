package ex24;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test


    public void testIsAnagram() {
        assertTrue(App.isAnagram("word", "wrdo"));
        assertTrue(App.isAnagram("mary", "army"));
        assertTrue(App.isAnagram("stop", "tops"));
        assertTrue(App.isAnagram("boat", "btoa"));
        assertFalse(App.isAnagram("pure", "in"));
        assertFalse(App.isAnagram("fill", "fil"));
        assertFalse(App.isAnagram("b", "bbb"));
        assertFalse(App.isAnagram("ccc", "ccccccc"));
        assertTrue(App.isAnagram("a", "a"));
        assertFalse(App.isAnagram("sleep", "slep"));

    }

    @Test
    public void testMain() {
        assertTrue(App.isAnagram("word", "wrdo"));
        assertTrue(App.isAnagram("mary", "army"));
        assertTrue(App.isAnagram("stop", "tops"));
        assertTrue(App.isAnagram("boat", "btoa"));
        assertFalse(App.isAnagram("pure", "in"));
        assertFalse(App.isAnagram("fill", "fil"));
        assertFalse(App.isAnagram("b", "bbb"));
        assertFalse(App.isAnagram("ccc", "ccccccc"));
        assertTrue(App.isAnagram("a", "a"));
        assertFalse(App.isAnagram("sleep", "slep"));

    }
}
