import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 8, 9, 4, 2 };
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
