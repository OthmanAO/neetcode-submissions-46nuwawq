class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

    try {
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '{' ||s.charAt(i) == '[' || s.charAt(i) =='('){
                stack.push(s.charAt(i));
                continue;
            } else {
                if (stack.peek() == '(' && s.charAt(i) == ')'){
                    stack.pop();
                    continue;
                } else if (stack.peek() == '{' && s.charAt(i) == '}'){
                    stack.pop();
                    continue;
                }else if (stack.peek() == '[' && s.charAt(i) == ']'){
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
    } catch (Exception e){
        return false;
    }

    return stack.empty();


    }
}
