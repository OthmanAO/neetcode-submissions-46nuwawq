class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if (tokens[i].equals("-")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y - x);
            } else if (tokens[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());               
            } else if (tokens[i].equals("/")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y / x);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.pop();

    }
}
