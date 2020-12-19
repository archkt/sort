public class SelectionSort {

    private static int findMinIndex(int[] arr, int starting) {
        int min = starting;
        for (int i = starting; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
