package taskFromCh;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsTest {

    @Test
    public void test() {
        String line  = "( ( ( ) ) [ ] { } [ ] ) [ ]";
        assertTrue(Brackets.parentheses(line));
    }

    @Test
    public void testBracketsNegative() {
        String line  = "( ( ( ) ) [ ] { } [ ] )  ]";
        assertFalse(Brackets.parentheses(line));
    }

    @Test
    public void testBracketsWithSymbol() {
        String line  = "=hdh8";
        assertTrue(Brackets.parentheses(line));
    }

    @Test
    public void testOpeningParenthesis() {
        String line  = "{{";
        assertFalse(Brackets.parentheses(line));
    }
}