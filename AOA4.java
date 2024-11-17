import java.util.Scanner;
/*
Problem Description
You are given an array A of length N. Your task is to find and return an integer value representing 
the difference between the sum of elements at odd index and XOR of elements at even index.

Input Format:
    input1: An integer N, representing the length of array.
    input2: An integer array A.
Output Format:
    Return an integer value representing the difference between the sum of elements at odd index and 
    XOR of elements at even index.

Constraints:
    N should be a positive integer.
    Each element in array A should be an integer.

Example
Sample Input:

6
10 5 6 3 7 2
Sample Output:

-1
Explanation:
Here N is 6 and the array A = (10, 5, 6, 3, 7, 2). The sum of elements at odd positions are 5 + 3 + 2 = 10 and
the XOR of elements at even positions are 10 ^ 6 ^ 7 = 11 and 
the difference is 10 - 11 = -1. Therefore, -1 is returned as the output.
 */


public class AOA4 { // time comeplexity O(N)
    public static int findDiffrence(int N,int nums[]){
        int XOR = 0;
        int sum = 0;
        for(int i = 0;i<N;i++){
            if((i&1)==0){
                XOR^=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return sum-XOR;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String arg[] = input.split(" ");
        int nums[] = new int[arg.length];
        in.close();
        for(int i = 0;i<arg.length;i++){
            nums[i]=Integer.parseInt(arg[i]);
        }
        int N = nums.length;
        System.out.println(findDiffrence(N,nums));
    }
    
}