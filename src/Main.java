import java.util.Random;

public class Main {

    private static int[] createRandomArray(int n) {
        Random r = new Random();
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = r.nextInt(n + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr10 = createRandomArray(10);
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i] + " ");
        }
        System.out.print("\n");


//        arr10 = InsertionSort.sort(arr10);
//        arr10 = SelectionSort.sort(arr10);
//        arr10 = MergeSort.sort(arr10);

        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i] + " ");
        }
    }
}
