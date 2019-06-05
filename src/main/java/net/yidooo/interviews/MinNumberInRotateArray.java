package net.yidooo.interviews;

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        } else if(array[0] < array[array.length - 1]) {
            return array[0];
        } else {
            return binarySearch(array, 0, array.length - 1);
        }
    }

    private int binarySearch(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if(mid == low || mid == array.length - 1) {
            return array[mid];
        } else if(array[mid] < array[mid - 1] && array[mid] <= array[mid + 1]) {
            return array[mid];
        } else if(array[low] < array[high]) {
            return array[low];
        } else {
            if(array[mid] > array[low]) {
                return binarySearch(array, mid + 1, high);
            } else {
                return binarySearch(array, low, mid - 1);
            }
        }
    }
}
