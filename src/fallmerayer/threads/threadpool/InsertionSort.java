package fallmerayer.threads.threadpool;

import java.util.Arrays;

public class InsertionSort {

    private static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void insertionSort(Integer[] arr){
        for (int i = 1; i< arr.length ; i++){
            while (i>0 && arr[i-1] > arr[i]){
                swap(arr, i, i-1);
                i = i -1;
            }
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }
}
