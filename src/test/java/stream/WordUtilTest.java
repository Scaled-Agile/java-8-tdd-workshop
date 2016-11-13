package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class WordUtilTest {

    @Test
    public void testUpCase() {
        List<String> words = Arrays.asList("hello", "world", "java");

        assertEquals(Arrays.asList("HELLO", "WORLD", "JAVA"), WordUtil.upCase(words));
    }

    @Test
    public void testUpCaseFirst() {
        List<String> words = Arrays.asList("hello", "world", "java");

        assertEquals(Arrays.asList("Hello", "World", "Java"), WordUtil.upCaseFirst(words));
    }

    @Test
    public void testCountBy() {
        List<String> words = Arrays.asList("hello", "world", "java");

        assertEquals(2, WordUtil.countBy(words, w -> w.length() > 4));
    }

    @Test
    public void testZip() {
        List<String> words1 = Arrays.asList("hello", "java");
        List<String> words2 = Arrays.asList("world");

        assertEquals(Arrays.asList("hello", "world", "java"), WordUtil.zip(words1, words2));
    }

    @Test
    public void testMacLength() {
        List<String> words = Arrays.asList("hello", "world", "Functional", "java");

        assertEquals(10, WordUtil.maxLength(words));
    }

    @Test
    public void testGroupBy() {
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "hello", "world");
        Map<String, Integer> expected = new HashMap<String, Integer>() {
            {
                put("hello", 3);
                put("world", 2);
                put("java", 1);
            }
        };

        assertEquals(expected, WordUtil.groupBy(words));
    }
}