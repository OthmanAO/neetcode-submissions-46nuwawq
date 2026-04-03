class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        if (s.length() % 2 != 0){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }
            

            if (s.charAt(i) == ')'){
                if (stack.empty() || stack.pop() != '('){
                    return false;
                }
                continue;
            }
            
            if (s.charAt(i) == '}'){
                if (stack.empty() || stack.pop() != '{'){
                    return false;
                }
                continue;
            }

            if (s.charAt(i) == ']'){
                if (stack.empty() || stack.pop() != '['){
                    return false;
                }
                continue;
            }
        }

        if (stack.empty() != true){
                return false;
        }

        return true;
    }
}
