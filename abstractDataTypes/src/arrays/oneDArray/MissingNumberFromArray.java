package arrays.oneDArray;

public class MissingNumberFromArray {
    public static void main(String[] args) {
        int[] elements={1,2,3,5,6,7};
        int n=elements.length+1; // size with one missing element
        //sum of first n natural numbers is calculated by n*(n+1)/2
        int sum= (n*(n+1))/2;
        for (int element:elements) {
            sum=sum-element;
        }

        System.out.println("Missing element from array is "+sum);

        // Time complexity O(n)
    }
}
