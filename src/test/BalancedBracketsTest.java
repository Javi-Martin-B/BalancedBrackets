package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void unbalancedNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void multiplePairsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void mixedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void bracketsWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c"));
    }

    @Test
    public void unbalancedBracketsWithOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("a[b"));
    }

    @Test
    public void onlyCurlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void unbalancedCurlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{"));
    }

}
