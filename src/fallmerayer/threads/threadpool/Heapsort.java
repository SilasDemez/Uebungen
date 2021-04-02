package fallmerayer.threads.threadpool;

import java.util.Arrays;

public class Heapsort {

    static int total;

    private static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void heapify(Comparable[] arr, int i) {
        int left = i*2;
        int right = i*2+1;
        int grt=i;

        if (left <= total && arr[left].compareTo(arr[grt])>=0)
            grt = left;     // if left node is greater than parent than swap them
        if (right <= total && arr[right].compareTo(arr[grt])>=0)
            grt = right;     // if right node is greater than parent than swap them
        if (grt != i){
            swap(arr,i,grt);
            heapify(arr,grt);
        }
    }

    public static void sort(Comparable[] arr) {
        total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--)
            heapify(arr, i);
        for (int i = total; i > 0; i--) {
            swap(arr,0,i);
            total--;
            heapify(arr,0);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }
}
