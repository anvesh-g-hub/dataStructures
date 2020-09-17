package arrays.oneDArray;

import java.util.HashSet;
import java.util.Set;

public class PairOfNumbersWhoseSumIsEqualToGivenNumber {
    // Find all possible pairs from a given array whose sum is equal to given number
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        bruteForce(numbers,7);
        usingSet(numbers,7);
    }


    public static void bruteForce(int[] numbers,int sum){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == sum){
                    sb.append("("+numbers[i]+","+numbers[j]+") \n");
                }
            }
        }
        System.out.println("All possible pairs are  \n"+sb.toString());
        // Time Complexity O(n*n)
    }

    public static void usingSet(int[] numbers,int sum){
        Set<Integer> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int number:numbers){
            int t=sum-number;
            if(!set.contains(t)){
                set.add(number);
            }else{
                sb.append("("+number+","+t+") \n");
            }
        }
        System.out.println("All possible pairs are  \n"+sb.toString());
        // Time Complexity O(n)
    }


}
