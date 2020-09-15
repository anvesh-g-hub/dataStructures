package arrays.oneDArray;

public class SecondMaxElementFromArray {
    public static void main(String[] args) {
        int[] elements={1,23,3,7,1,20};
        int firstMax=elements[0];
        int secondMax=elements[0];
        for (int i=1;i<elements.length;i++) {
            if(firstMax<elements[i]){
                secondMax=firstMax;
                firstMax=elements[i];
            }else{
                if(elements[i]>secondMax && elements[i]!=firstMax){
                    secondMax=elements[i];
                }
            }
        }

        System.out.println("Second Max Element "+secondMax);
    }
}
