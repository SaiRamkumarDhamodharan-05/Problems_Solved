//Given array where first half and second half are each sorted (e.g. {2,3,8,-1,7,10}), merge them into one sorted array in-place using insertion sort logic — no extra space.

import java.util.Arrays;
public class Sort {
    public static void merge(int[] arr) {
        int n = arr.length;
        for (int i = n/2; i < n; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, -1, 7, 10};
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
