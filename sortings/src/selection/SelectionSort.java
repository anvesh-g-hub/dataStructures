package selection;

public class SelectionSort {

    public int[] sort(int[] arr) {
        int minIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }


        }
        return arr;
    }

}
