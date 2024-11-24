/*
You are given a string array of length N . Your task is to find and return an integer value representing the maximum permutation count of the strings after removing all the vowels from every element in the string array.

Notes:

If a string has no permutable characters (all characters are different), its permutation count is 0.
The strings can contain both uppercase and lowercase letters.
Input Format:
input1: A string array of length N.
input2: An integer N representing the size of the string array.
Output Format:
Return an integer value representing the maximum permutation count among the string elements.

Constraints:
1 ≤ N ≤ 100
1 ≤ |str[i]| ≤ 100
 */
import java.util.*;
public class AOA7 {

    //Brute Force --> O(N^str.length)
    public static int findMaxPermutation(String arr[],int N){
        int maxPermut = 0;
        for(int i=0;i<N;i++){
           
        }
        return maxPermut;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextLine();
        }
        sc.close();
        System.out.println(findMaxPermutation(arr,N));
        
    }
}
