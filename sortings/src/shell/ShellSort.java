package shell;

public class ShellSort {
    public int[] sort(int arr[]) {
        int h = 3;
        int n = arr.length;
        int i, j, temp;


        while (h > 0) {

            for (i = h; i < n; i++) {

                temp = arr[i];

                for (j = i - h; j >= 0 && arr[j] > temp; j = j - h) {
                    arr[j + h] = arr[j];
                }
                arr[j + h] = temp;
            }

            h = h - 2;
        }
        return arr;

    }
}
