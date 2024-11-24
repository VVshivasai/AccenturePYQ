/*Ian has been given an array A of length N. He wants to find the sum of elements at even positions after reversing the array. 
Your task is to help him find and return an integer value representing the sum of the array elements present at even positions of the reversed array.

Input Format:
input1: A reversed integer array A.
input2: An integer N, representing the length of the array.
Output Format:
Return an integer value representing the sum of the array elements present at the even positions of the reversed array.

Constraints:
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ 10^9
Example
Sample Input:

input1: (10, 20, 30, 40, 50, 60)
input2: 6
Sample Output:120

Explanation:
After reversing the array, it becomes (60, 50, 40, 30, 20, 10).
The even positions are 0, 2, and 4. The sum of elements at these positions is 60 + 40 + 20 = 120. 
Therefore, the output is 120. */

import java.util.*;

public class AOA8 {
    public static int FindSum(int arr[],int N){
        int sum = 0;
        if(N%2==0){
            for(int i =0;i<N;i++){
                if(i%2!=0){
                    sum+=arr[i];
                }
            }
        }else{
            for(int i =0;i<N;i++){
                if(i%2==0){
                    sum+=arr[i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N; i++){
                arr[i]=in.nextInt();
        }
        System.out.println("Output is ");
        System.out.println(FindSum(arr, N));
        in.close();
    }
}
