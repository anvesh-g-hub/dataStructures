import selection.SelectionSort;

public class Driver {
    public static void main(String[] args) {
        int[] arr={45,38,59,12,66,23};
        SelectionSort selectionSort=new SelectionSort();
        int[] sortedArr=selectionSort.sort(arr);
        for(int s:sortedArr){
            System.out.print(s+" ");
        }

    }
}
