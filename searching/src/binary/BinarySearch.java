package binary;

public class BinarySearch {

    public void binarySearch(int[] array,int elementToSearch){
        int first=0;
        int last=array.length-1;
        int mid=-1;
        int index=-1;

        while(last>=first){
            mid=(first+last)/2;
            if(elementToSearch == array[mid]){
                //success
                index=mid;
                break;
            }else if(elementToSearch < array[mid]){
                //first sub array

                last=mid-1;

            }else if(elementToSearch > array[mid]){
                //second sub array

                first=mid+1;

            }
        }

        if(index!=-1){
            System.out.println("Element found at index "+index);
        }else{
            System.out.println("Element found not found");
        }


    }

}
