public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while (i < s.length()) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                stack.push(temp);
            } else if (stack.size() != 0) {
                char left = stack.peek();
                if ((left == '(' && temp == ')') || (left == '[' && temp == ']') ||(left == '{' && temp == '}')) {
                    stack.pop();
                } else {
                    stack.push(temp);
                }
            } else {
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
