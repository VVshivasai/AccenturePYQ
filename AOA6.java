/*
Alex is exploring a series and she came across a special series in which
* f(N) = f(N-1) * f(N-1) + f(N-2) * f(N-2)
* where, f(0) = 1 and f(1) = 1

Your task is to help Alex find and return an integer value representing the Nth number in this special series.

Note: Return the output modulo 47.

Input Format:
input1: An integer value N.
Output Format:
Return an integer value representing the Nth number in this special series, modulo 47.

Constraints:
0 ≤ N ≤ 10^9
Example
Sample Input:

N = 5
Sample Output:

18
Explanation:
Let's calculate the first few terms of the series using the given formula:

f(0) = 1(given)
f(1) = 1 (given)
f(2) = f(1) * f(1) + f(0) * f(0) = 1 * 1 + 1 * 1 = 2
f(3) = f(2) * f(2) + f(1) * f(1) = 2 * 2 + 1 * 1 = 5
f(4) = f(3) * f(3) + f(2) * f(2) = 5 * 5 + 2 * 2 = 29
f(5) = f(4) * f(4) + f(3) * f(3) = 29 * 29 + 5 * 5 = 878
Now, we need to calculate f(5) modulo 47.
878 mod 47 = 18
*/
import java.util.*;

public class AOA6 {

    //Recursion-->O(2^N)
    public static int recursion(int N){
        if(N==0){
            return 1;
        }if(N==1){
            return 1;
        }
        int N1 = recursion(N-1);
        int N2 = recursion(N-2);
        return (N1*N1+N2*N2)%47;
    }
    //memoization--> O(N)
    public static int memoization(int N,int dp[]){
        if(N==0 || N==1){
            return dp[N]=1;
        }
        if(dp[N]!=0){
            return dp[N];
        }
        int n1 = memoization(N-1, dp);
        int n2 = memoization(N-2,dp);
        return dp[N]=(n1*n1+n2*n2)%47;
    }

    //tabulation-->O(N)
    public static int tabulation(int N){
        if(N==0 ||N==1){
            return 1;
        }
        int dp[] = new int[N+1];
        //intial case 
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1]*dp[i-1] + dp[i-2]*dp[i-2])%47;
        }
        return dp[N]%47;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        //Recursion
        System.out.println(recursion(N));
        //Memoization
        int dp[] = new int[N+1];
        System.out.println(memoization(N,dp));
        //Tabulation
        System.out.println(tabulation(N));
    }
}