class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++){
            try {
                int curr = Integer.parseInt(tokens[i]);
                stack.push(curr);
            } catch (Exception e){
                if (tokens[i].charAt(0) == '+'){
                    stack.push(stack.pop() + stack.pop());
                } else if (tokens[i].charAt(0) == '-'){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val2 - val1);
                } else if (tokens[i].charAt(0) == '*'){
                    stack.push(stack.pop() * stack.pop());
                } else if (tokens[i].charAt(0) == '/'){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val2 / val1);
                }
            }
        }

        return stack.pop();
    }
}
