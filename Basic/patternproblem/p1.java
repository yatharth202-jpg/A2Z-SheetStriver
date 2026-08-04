package Basic.patternproblem;

/*

   *
  ***
 *****
*******

*/

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of pattern : ");
        int n = sc.nextInt();

      
         for(int i=1; i<=n ; i++) {
//for left space
        for(int j=n-i ; j>0 ; j--) {
            System.out.print(" ");
          }
  //for stars
        for(int j=1 ; j<=i ; j++) {
            System.out.print("*");
          }

        if(i>1){
        for(int j=1 ; j<=i-1 ; j++) {
            System.out.print("*");
          }
        }
        System.out.println();
    }
        sc.close();
    }
}
