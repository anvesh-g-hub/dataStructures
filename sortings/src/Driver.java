import bubble.BubbleSort;
import insertion.InsertionSort;
import selection.SelectionSort;
import shell.ShellSort;

public class Driver {
    public static void main(String[] args) {
        int[] arr={45,38,59,12,66,23};
//        SelectionSort selectionSort=new SelectionSort();
//        int[] sortedArr=selectionSort.sort(arr);

//        BubbleSort bs=new BubbleSort();
//        int[] sortedArr=bs.sort(arr);

//        InsertionSort is=new InsertionSort();
//        int[] sortedArr=is.sort(arr);


        ShellSort ss=new ShellSort();
        int[] sortedArr=ss.sort(arr);
        for(int s:sortedArr){
            System.out.print(s+" ");
        }

    }
}
