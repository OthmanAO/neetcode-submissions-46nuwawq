
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();

        while (true) {
            n = sumSquares(n); 

            if (n == 1) {
                return true;
            }

            if (!seen.add(n)) {
                return false;
            }
        }
    }

    public int sumSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}