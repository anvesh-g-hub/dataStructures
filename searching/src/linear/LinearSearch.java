package linear;

public class LinearSearch {
    public int search(int[] array,int size,int searchElement){
        int index=-1;
        for(int i=0;i<size;i++){
            if(searchElement==array[i]){
                index=i;
            }
        }
        return index;
    }
}
