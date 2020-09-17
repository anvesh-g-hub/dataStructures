package arrays.oneDArray;

public class ThirdMaxElementFromArray {
    public static void main(String[] args) {
        int[] elements={1,23,3,7,1,20};
        int fMax=elements[0];
        int sMax=elements[0];
        int tMax=elements[0];
        for(int i=1;i<elements.length;i++){
            if(fMax<elements[i]){
                tMax=sMax;
                sMax=fMax;
                fMax=elements[i];
            }else if(sMax<elements[i]){
                tMax=sMax;
                sMax=elements[i];
            }else {
                if(tMax<elements[i]){
                    tMax=elements[i];
                }
            }
        }
        System.out.println("First maximum element "+fMax);
        System.out.println("Second maximum element "+sMax);
        System.out.println("Third maximum element "+tMax);

        // Time complexity O(n)
    }
}
