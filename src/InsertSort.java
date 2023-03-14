package src;

import static src.util.Util.*;

public class InsertSort {
    public static int[] insertSort(int[] originalArr) {
        int len = originalArr.length;
        if (len < 2) {
            return originalArr;
        }
        int[] arr = cloneArr(originalArr);
        for (int i = 1; i < len; i += 1) {
            for (int j = i; j > 0; j -= 1) {
                if (arr[j] < arr[j - 1]) {
                    swapArrEle(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, 0, -2, 9, 8, 2, 7};
        printArr(arr);
        int[] res = insertSort(arr);
        printArr(res);
        int[] arr2 = {1, 0};
        printArr(insertSort(arr2));
    }
}
