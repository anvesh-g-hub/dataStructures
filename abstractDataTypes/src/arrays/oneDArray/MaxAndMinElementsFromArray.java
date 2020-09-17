package arrays.oneDArray;

public class MaxAndMinElementsFromArray {
    public static void main(String[] args) {
        int[] elements={1,23,3,7,1,20};
        int max=elements[0];
        int min=elements[0];
        for(int i=1;i<elements.length;i++){
            if(max<elements[i]){
                max=elements[i];
            }
            if(min>elements[i]){
                min=elements[i];
            }
        }
        System.out.println("Max element in an array is  "+max);
        System.out.println("Min element in an array is  "+min);
    }
}
