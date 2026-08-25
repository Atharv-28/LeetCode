class Solution {
    public boolean isValid(String s) {
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st1.push(c);
            } else {
                if (st1.isEmpty()) {
                    return false;
                }
                char top = st1.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return st1.isEmpty();
    }
}