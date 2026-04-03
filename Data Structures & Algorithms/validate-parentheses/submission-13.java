class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
            } else {
                if (curr == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                } else if (curr == '}'){
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                } else if (curr == ']'){
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }   

        return stack.isEmpty();

    }
}
