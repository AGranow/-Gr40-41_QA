package taskFromCh;

import java.util.Stack;
/**
 * Есть текст в нём расставлены скобки. Проверить все ли скобки закрываются в
 * правильном порядке.  (), [], {}
 * решение от Kristinochka-bee.
 */
public class Brackets {

    public static boolean parentheses(String line){
        Stack<Character> stack = new Stack<>();
        for (char c: line.toCharArray()) {
            if (c == '{' || c == '[')
                stack.push(c);
            if ( c == '}' && stack.isEmpty()|| c == ']'&& stack.isEmpty()){
                return false;
            }
            else if (c == '}' && stack.peek() == '{' || c == ']' && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
