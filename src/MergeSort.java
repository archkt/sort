public class MergeSort{

    private static int[] merge(int[] left, int[] right){
        int[] res = new int[left.length + right.length];
        int l = 0, r = 0;

        for (int i = 0; i < res.length; i++) {
            if (l == left.length || r == right.length) {
                if (l == left.length) {
                    System.arraycopy(right, r, res, i, right.length - r);
                } else {
                    System.arraycopy(left, l, res, i, left.length - l);
                }
                break;
            }

            if (left[l] <= right[r]) {
                res[i] = left[l];
                l++;
            } else {
                res[i] = right[r];
                r++;
            }
        }

        return res;
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);

        return merge(sort(left), sort(right));
    }
}
