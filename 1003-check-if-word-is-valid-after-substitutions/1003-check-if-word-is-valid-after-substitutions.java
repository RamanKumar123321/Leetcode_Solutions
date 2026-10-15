class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {
            stack[top++] = c;

            if (top >= 3 &&
                stack[top - 3] == 'a' &&
                stack[top - 2] == 'b' &&
                stack[top - 1] == 'c') {
                top -= 3;
            }
        }

        return top == 0;
    }
}