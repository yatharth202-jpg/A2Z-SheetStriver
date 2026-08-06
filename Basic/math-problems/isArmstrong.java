public class isArmstrong {
    class Solution {
    public boolean isArmstrong(int n) {
        int on = n;
        int count = 0;
        int ans = 0;

        while(n > 0) {
            count++;
            n /= 10;
        }

        n = on;

         while(n > 0) {
            int digit = n % 10;
            ans += Math.pow(digit , count);
            n /= 10;
        }

        if(ans == on) {
            return true;
        } else {
            return false;
        }
    }
}
}
