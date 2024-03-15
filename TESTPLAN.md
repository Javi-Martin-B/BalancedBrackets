# BalancedBracketsTest Explanation

This file contains test cases for the `BalancedBrackets` class.

---
## The Rules for every test, read every test title properly!
>### - Only brackets return true
>### - Nested brackets are allowed
>### - Brackets must follow open close order

### Test Cases:

1. **Empty Test**
    >**Was the one at the example!**
    - Description: Ensures that the testing framework is working.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void emptyTest() {
            assertEquals(true, true);
        }
        ```

2. **Only Brackets Returns True**
    - Description: Tests if the method returns `true` when given only brackets.
    - Input: `"[]"`.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void onlyBracketsReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        }
        ```

3. **Empty String Returns True**
    - Description: Tests if the method returns `true` when given an empty string.
    - Input: `""`.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void emptyStringReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        }
        ```

4. **Single Open Bracket Returns False**
    - Description: Tests if the method returns `false` when given a single open bracket.
    - Input: `"["`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void singleOpenBracketReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        }
        ```

5. **Single Close Bracket Returns False**
    - Description: Tests if the method returns `false` when given a single close bracket.
    - Input: `"]"`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void singleCloseBracketReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        }
        ```

6. **Nested Brackets Returns True**
    - Description: Tests if the method returns `true` for nested brackets.
    - Input: `"[[[]]]"`.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void nestedBracketsReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        }
        ```

7. **Unbalanced Nested Brackets Returns False**
    - Description: Tests if the method returns `false` for unbalanced nested brackets.
    - Input: `"[[[]"`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void unbalancedNestedBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        }
        ```

8. **Multiple Pairs Of Brackets Returns True**
    - Description: Tests if the method returns `true` for multiple pairs of brackets.
    - Input: `"[[[]]]"`.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void multiplePairsOfBracketsReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
        }
        ```

9. **Mixed Brackets Returns False**
    - Description: Tests if the method returns `false` for mixed brackets.
    - Input: `"[[[]]"`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void mixedBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
        }
        ```

10. **Brackets With Text Returns True**
    - Description: Tests if the method returns `true` when given brackets with text.
    - Input: `"a[b]c"`.
    - Expected Result: `true`.
    - Code:
        ```java
        @Test
        public void bracketsWithTextReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c"));
        }
        ```

11. **Unbalanced Brackets With Text Returns False**
    - Description: Tests if the method returns `false` when given unbalanced brackets with text.
    - Input: `"a[b"`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void unbalancedBracketsWithTextReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("a[b"));
        }
        ```

12. **Text After And Before Brackets Returns False**
    - Description: Tests if the method returns `false` when given text, a closed Bracket and more text.
    - Input: `"ab]c"`.
    - Expected Result: `false`.
    - Code:
        ```java
         @Test
        public void textAfterAndBeforeBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("ab]c"));
        }
        ```

13. **Text Before Brackets Returns False**
    - Description: Tests if the method returns `false` when given unbalanced curly brackets.
    - Input: `"ab]"`.
    - Expected Result: `false`.
    - Code:
        ```java
        @Test
        public void TextBeforeBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("ab]"));
        }   
        ```