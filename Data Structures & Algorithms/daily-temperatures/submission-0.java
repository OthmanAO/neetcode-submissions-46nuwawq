class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> s = new Stack<>();
        int[] temps = new int[temperatures.length];

    for ( int j = 0; j < temperatures.length; j++){
        for (int i = temperatures.length - 1; i > j; i--){
            s.push(temperatures[i]);
        }

        for (int k = 1; k < temperatures.length - j; k++){
            if (temperatures[j] < s.pop()){
                temps[j] = k;
                break;
            }
        }

    }
    
    return temps;

    }
}
