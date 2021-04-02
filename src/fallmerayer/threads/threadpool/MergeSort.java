package fallmerayer.threads.threadpool;

import java.util.Arrays;

public class MergeSort {
    // Function to Merge Arrays L and R into A.
// lefCount = number of elements in L
// rightCount = number of elements in R.
    public static void merge(Integer[] arr,Integer[] L,int leftCount,Integer[] R,int rightCount) {
        int i,j,k;

        // i - to mark the index of left subarray (L)
        // j - to mark the index of right subarray (R)
        // k - to mark the index of merged subarray (A)
        i = 0; j = 0; k =0;

        while(i<leftCount && j< rightCount) {
            if(L[i]  < R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while(i < leftCount) arr[k++] = L[i++];
        while(j < rightCount) arr[k++] = R[j++];
    }

    // Recursive function to sort an array of integers.
    public static void mergeSort(Integer[] arr,int n) {
        int mid,i;

        if(n < 2) return; // base condition. If the array has less than two element, do nothing.

        mid = n/2;  // find the mid index.

        // create left and right subarrays
        // mid elements (from index 0 till mid-1) should be part of left sub-array
        // and (n-mid) elements (from mid to n-1) will be part of right sub-array
        Integer[] L = new Integer[mid];
        Integer[] R = new Integer[n-mid];

        for(i = 0;i<mid;i++) L[i] = arr[i]; // creating left subarray
        for(i = mid;i<n;i++) R[i-mid] = arr[i]; // creating right subarray

        mergeSort(L,mid);  // sorting the left subarray
        mergeSort(R,n-mid);  // sorting the right subarray
        merge(arr,L,mid,R,n-mid);  // Merging L and R into A as sorted list.
    }

    public static void main(String[] args) {
        Integer[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }
}