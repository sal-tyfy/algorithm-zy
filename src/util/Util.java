package src.util;

public class Util {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] cloneArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i += 1) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
