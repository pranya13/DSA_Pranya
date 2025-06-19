import java.util.Arrays;

public class ThreePointer {
    static int[] sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 2) {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            } else if (arr[mid] == 1) {
                mid++;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 2, 1, 0, 0, 2, 1 };
        System.out.println(Arrays.toString(sort(arr)));

    }
}
