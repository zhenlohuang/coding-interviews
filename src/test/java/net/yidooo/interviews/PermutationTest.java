package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PermutationTest {
    @Test
    public void testEmptyString() {
        Assert.assertEquals(new Permutation().Permutation(null), new ArrayList<>());
        Assert.assertEquals(new Permutation().Permutation(""), new ArrayList<>());
    }

    @Test
    public void testSingleCharString() {
        Assert.assertEquals(new Permutation().Permutation("a"), Arrays.asList("a"));
    }

    @Test
    public void testMultipleCharsString() {
        List<String> actual = new Permutation().Permutation("abc");
        actual.sort(Comparator.naturalOrder());
        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringWithDuplicatedChars() {
        List<String> actual = new Permutation().Permutation("aa");
        actual.sort(Comparator.naturalOrder());
        List<String> expected = Arrays.asList("aa");
        Assert.assertEquals(actual, expected);
    }
}
