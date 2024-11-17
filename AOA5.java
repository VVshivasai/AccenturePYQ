import java.util.*;
/*
Problem Description
Noah is given an integer array A of length N. He must perform the following operations on the array:

Select any integer pair/s from the given array with their sum equal to 18.
From this selection, choose the pair with the maximum product such that the first element of the pair is greater than the second element of the pair.
Your task is to help Noah find and return a pair in the form of an integer array which satisfies the conditions mentioned.

Input Format:
input1: An integer value N, representing the size of array A.
input2: An integer array A.
Output Format:
Return a pair in the form of an integer array which satisfies the conditions mentioned.

Constraints:
2 ≤ N ≤ 10^5
1 ≤ A[i] ≤ 18
Example
Sample Input:

8
11 1 2 8 10 11 15 7
Sample Output:

(10,8)
Explanation:
In the given array A = [11, 1, 2, 8, 10, 11, 15, 7], we need to find a pair of numbers

In this case, the pairs (10, 8) and (11, 7) both sum to 18 and satisfy the second condition. However, the product of (10, 8) is 80, which is greater than the product of (11, 7) which is 77.

Therefore, the pair (10, 8) is the desired output.
 */



public class AOA5 {
    //Optimized O(N)time and O(N) space
    public static int[] findPair2(int nums[],int N){
        int ans[]={-1,-1};
        int maxProd =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            if(set.contains(18-nums[i])){
                int prod = nums[i]*(18-nums[i]);
                if(prod > maxProd){
                    maxProd = prod;
                    ans[0] = Math.max(nums[i],(18-nums[i]));
                    ans[1] = Math.min(nums[i],(18-nums[i]));
                }
            }
            set.add(nums[i]);
        }
        return ans;
    }
    //Brute force O(N^2)
    public static int[] findPair1(int nums[],int N){
        int ans[] = {-1,-1};
        int maxProd = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(nums[i]+nums[j]==18){
                    if(nums[i]*nums[j]>maxProd && nums[i]>nums[j]){
                        maxProd =nums[i]*nums[j];
                        ans[0]=nums[i];
                        ans[1]=nums[j];
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nums[] = new int[N];
        for(int i =0;i<N;i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(findPair1(nums,N)));
        System.out.println(Arrays.toString(findPair2(nums,N)));
    }
}
