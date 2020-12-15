package practice.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced(String input) {
        if (input.length() == 0)
            return true;
        Stack<Integer> openParenthesisStack = new Stack<>();
        Stack<Integer> closeParenthesisStack = new Stack<>();
        Stack<Integer> openBracketStack = new Stack<>();
        Stack<Integer> closeBracketStack = new Stack<>();
        Stack<Integer> openCurlyStack = new Stack<>();
        Stack<Integer> closeCurlyStack = new Stack<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                    openParenthesisStack.add(i);
                    break;
                case ')':
                    closeParenthesisStack.add(i);
                    break;
                case '[':
                    openBracketStack.add(i);
                    break;
                case ']':
                    closeBracketStack.add(i);
                    break;
                case '{':
                    openCurlyStack.add(i);
                    break;
                case '}':
                    closeCurlyStack.add(i);
                    break;
            }
        }
        return openParenthesisStack.size() == closeParenthesisStack.size()
                && openBracketStack.size() == closeBracketStack.size()
                && openCurlyStack.size() == closeCurlyStack.size()
                && checkIndexes(openParenthesisStack, closeParenthesisStack)
                && checkIndexes(openBracketStack, closeBracketStack)
                && checkIndexes(openCurlyStack, closeCurlyStack);

    }
    private static boolean checkIndexes(Stack<Integer> openStack, Stack<Integer> closeStack) {
        if (openStack.size() == 0)
            return true;
        while (! openStack.empty()) {
            if (openStack.pop() > closeStack.pop())
                return false;
        }
        return true;
    }

}
