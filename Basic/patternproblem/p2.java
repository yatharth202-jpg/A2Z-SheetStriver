package Basic.patternproblem;

/*
   4 4 4 4 4 4 4 4 
   4 3 3 3 3 3 3 4
   4 3 2 2 2 2 3 4
   4 3 2 1 1 2 3 4
   4 3 2 1 1 2 3 4
   4 3 2 2 2 2 3 4
   4 3 3 3 3 3 3 4
   4 4 4 4 4 4 4 4
*/
import java.util.*;
public class p2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 8;

      
        for(int i=0; i<=n ; i++) {
        for(int j=0 ; j<=n ; j++) {
            if( i == n || i == 0 || j == 0 || j == n) {
                System.out.print(4 + " ");
            } else if(i == 1 || j == 1 || i == n-1 || j == n-1) {
                System.out.print(3 + " ");
            } else if(i == 2 || j == 2 || i == n-2 || j == n-2) {
                System.out.print(2 + " ");
            }
             else {
                System.out.print(1 + " ");
            }
             }
             System.out.println();
         }  
            sc.close();
      }
    }