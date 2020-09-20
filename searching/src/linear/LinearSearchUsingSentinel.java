package linear;

public class LinearSearchUsingSentinel {
    public int search(int[] inputAarray,int size,int searchElement){
        inputAarray[size]=searchElement;
        int index=-1;
        int i=0;
        while(inputAarray[i]!=searchElement){
            i++;
        }

        if(i<size){
            index=i;
        }
        return index;
    }
}
