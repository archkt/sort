import java.util.Arrays;

public class QuickSort {

    private static int[] concat(int pivot, int[] left, int[] right) {
        int[] res = new int[left.length + right.length + 1];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            res[count] = left[i];
            count++;
        }
        res[count] = pivot;
        count++;
        for (int j = 0; j < right.length; j++) {
            res[count] = right[j];
            count++;
        }
        return res;
    }

    private static int[] threeScanPartition(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) return arr;

        int[] res = new int[length];
        int index = 0;
        int pivot = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] < pivot) {
                res[index] = arr[i];
                index += 1;
            }
        }

        res[index] = pivot;
        int pivotIndex = index;
        index += 1;

        for (int j = 1; j < length; j++) {
            if (arr[j] >= pivot) {
                res[index] = arr[j];
                index += 1;
            }
        }

        return concat(pivot, threeScanPartition(Arrays.copyOfRange(res, 0, pivotIndex)), threeScanPartition(Arrays.copyOfRange(res, pivotIndex + 1, length)));
    }

    private void tonyHoarePartition(int[] arr) {

    }

    public static int[] sort(int[] arr) {

        return threeScanPartition(arr);
    }
}
