package src;

import static src.util.Util.cloneArr;
import static src.util.Util.printArr;

public class BubbleSort {

    public static int[] bubbleSort(int[] originalArr) {
        int len = originalArr.length;
        if (len < 2) {
            return originalArr;
        }
        int[] arr = cloneArr(originalArr);
        for (int i = 0; i < len - 1; i += 1) {
            for (int j = 0; j < len - 1 - i; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 0, -2, 1};
        int[] res = bubbleSort(arr);
        printArr(arr);
        printArr(res);
        int[] arr2 = {1, 0};
        printArr(bubbleSort(arr2));
    }
}
