package arrays.oneDArray;

public class MaxElementFromArray {
    public static void main(String[] args) {
        int[] elements={1,23,3,7,1,20};
        int max=elements[0];
        for(int element:elements){
            if(element>max){
                max=element;
            }
        }
        System.out.println("Maximum element in array is "+max);


    }
}
