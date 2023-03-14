package src;

public class SelectionSort {

    public static int[] cloneArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i += 1) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] selectSort(int[] originalArr) {
        int[] arr = cloneArr(originalArr);
        if (arr.length < 2) {
            return arr;
        }
        int temp;
        int index;
        for (int i = 0; i < arr.length - 1; i += 1) {
            temp = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j += 1) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 10, 0, 2, 3, 6, 8, 4, 1, 5};
        int[] res = selectSort(arr);
        print(arr);
        print(res);
        int[] arr2 = {1};
        print(selectSort(arr2));
    }
}
