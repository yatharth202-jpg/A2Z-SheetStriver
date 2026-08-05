import java.util.*;
public class countAllDigits {

    public static int countDigit(int n) {
        if(n == 0) {
            return 1;
        }
    int count = 0;
   
    while(n>0) {
        if(n == 0) {
            count++;
        }
        n /= 10;
        count++;
    }
    return count;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = countDigit(n);
        System.out.println("Number of digits is : " + ans);
        sc.close();
      }
    }