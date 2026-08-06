public class allDivisor {
    class Solution { 
    public int[] divisors(int n) { 
        List<Integer> divisorList = new ArrayList<>();
        
         for (int i = 1; i <= n; i++) { 
            if (n % i == 0) { 
                divisorList.add(i); // Add the divisor to our list
            } 
        } 
        
       int[] result = new int[divisorList.size()];
        for (int i = 0; i < divisorList.size(); i++) {
            result[i] = divisorList.get(i);
        }
        
        return result; 
    } 
}
}
