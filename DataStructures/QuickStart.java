import java.util.Arrays;

public class QuickStart {
    public static void main(String[] args) {
        int arr[] = {10, 4, 9, 3, 4, 8};
        quickStart(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickStart(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int pivot = arr[(low + high) / 2];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        if (low < end) {
            quickStart(arr, low, end);
        }
        if (start < high) {
            quickStart(arr, start, high);
        }
    }
}
