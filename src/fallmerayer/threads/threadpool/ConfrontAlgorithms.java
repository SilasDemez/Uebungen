package fallmerayer.threads.threadpool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import static fallmerayer.threads.threadpool.Heapsort.heapSort;
import static fallmerayer.threads.threadpool.InsertionSort.insertionSort;
import static fallmerayer.threads.threadpool.MergeSort.mergeSort;

public class ConfrontAlgorithms {
    static Integer[] arr;

    public static void random(int length){
        arr = new Integer[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void sequentialCompare() {
        double sum=0;
        Integer[] clone = arr.clone();
        double startTime = System.nanoTime();

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, arr.length);

        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));

        double stopTime = System.nanoTime();
        double duration = (stopTime - startTime) / 1_000_000;  //divide by 1000000 to get milliseconds.
        sum += duration;
        System.out.println("Execution Time mergeSort: " + duration + "ms");

        arr = clone;
        System.out.println("Array1: " + Arrays.toString(clone));

        startTime = System.nanoTime();

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array2: " + Arrays.toString(clone));

        heapSort(arr);

        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));


        stopTime = System.nanoTime();
        duration = (stopTime - startTime) / 1_000_000;  //divide by 1000000 to get milliseconds.
        sum += duration;
        System.out.println("Execution Time heapSort: " + duration + "ms");

        System.out.println("Array1: " + Arrays.toString(clone));
        arr = clone;

        startTime = System.nanoTime();

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));

        stopTime = System.nanoTime();
        duration = (stopTime - startTime) / 1_000_000;  //divide by 1000000 to get milliseconds.
        sum += duration;
        System.out.println("Execution Time insertionSort: " + duration + "ms");
        System.out.println("Execution Time sequential: " + sum + "ms");

        arr = clone;
    }

    public static void threadPool_invokeAll(){
        ExecutorService service= Executors.newCachedThreadPool();
        //Integer futureList;
        List<Future<Integer>> futureList;
        List<Callable<Integer>> callableList=new ArrayList<>();

        Callable c1=new Task();
        Callable c2=new Task2();
        Callable c3=new Task3();

        callableList.add(c1);
        callableList.add(c2);
        callableList.add(c3);
        //System.out.println(Arrays.toString(arr));
        double startTime = System.nanoTime();
        try {
            futureList=service.invokeAll(callableList);
            //futureList=service.invokeAny(callableList);
        } catch (InterruptedException  e) {
            e.printStackTrace();
        }
        double stopTime = System.nanoTime();

        //System.out.println(Arrays.toString(arr));
        service.shutdown();
        double duration = (stopTime - startTime) / 1_000_000;  //divide by 1000000 to get milliseconds.
        System.out.println("Execution Time InvokeAll: " + duration + "ms");
    }

    public static void threadPool_invokeAny(){
        ExecutorService service= Executors.newCachedThreadPool();
        //Integer futureList;
        Integer futureList;
        List<Callable<Integer>> callableList=new ArrayList<>();

        Callable c1=new Task();
        Callable c2=new Task2();
        Callable c3=new Task3();

        callableList.add(c1);
        callableList.add(c2);
        callableList.add(c3);
        //System.out.println(Arrays.toString(arr));
        double startTime = System.nanoTime();
        try {
            //futureList=service.invokeAll(callableList);
            futureList=service.invokeAny(callableList);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        double stopTime = System.nanoTime();

        //System.out.println(Arrays.toString(arr));
        service.shutdown();
        double duration = (stopTime - startTime) / 1_000_000;  //divide by 1000000 to get milliseconds.
        System.out.println("Execution Time InvokeAny: " + duration + "ms");
    }


    public static void main(String[] args) {
        random(10);
        sequentialCompare();
        threadPool_invokeAll();
        threadPool_invokeAny();
    }


    static class Task implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            mergeSort(arr, arr.length);
            return null;
        }
    }

    static class Task2 implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            heapSort(arr);
            return null;
        }
    }
    static class Task3 implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            insertionSort(arr);
            return null;
        }
    }
}
