package insertion;

public class InsertionSort {

    public int[] sort(int[] arr) {
        int n = arr.length;
        int temp, j;
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = temp;


        }
        return arr;
    }

}
