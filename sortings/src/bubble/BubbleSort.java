package bubble;

public class BubbleSort {

    public int[] sort(int[] arr) {

        int x = arr.length - 2;
        int temp;
        int swaps;
        for (int i = x; i >= 0; i--) { // Number of passes
            swaps=0;
            for (int j = 0; j <= x; j++) { // Number of comparisons
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }

            if(swaps==0)
                    break;
            
        }


        return arr;
    }
}
