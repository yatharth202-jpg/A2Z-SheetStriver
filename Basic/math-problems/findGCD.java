public class findGCD {
    class Solution {
    public int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGCD(n2, n1 % n2);
    }


    }
}
