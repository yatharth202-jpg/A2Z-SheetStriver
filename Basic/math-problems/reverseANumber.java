package Basic.math-problems;

public class reverseANumber {
    class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            res = res * 10 + digit;
        }
        return isNegative ? -res : res;
    }
}
}
