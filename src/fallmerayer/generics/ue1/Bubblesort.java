package fallmerayer.generics.ue1;

import java.util.Arrays;

//https://big-o.io/examples/bubble-sort/java-generic/
public class Bubblesort<T extends Comparable<? super T>> {

    protected T[] array;
    protected T temp;


    void sort(T[] array){
        int n = array.length;

        for (int j=1;j<=n;j++){
            for (int i=0;i<n-1;i++){
                if (array[i].compareTo(array[i+1]) > 0){
                  temp = array[i];
                  array[i] = array[i+1];
                  array[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Beispiel Integer
        Bubblesort<Integer> integerBubblesort = new Bubblesort<>();
        Integer[] intArray = {1,3,2,5,2,1,6,8,5,3};
        System.out.println("Given int array: " + Arrays.toString(intArray));
        integerBubblesort.sort(intArray);
        System.out.println("Sorted int array: " + Arrays.toString(intArray));

        System.out.println(""); // Newline

        // Beispiel Char
        Bubblesort<Character> stringBubblesort = new Bubblesort<>();
        Character[] charArray = {'1','3','2','5','2','1','6','8','5','3'};
        System.out.println("Given char array: " + Arrays.toString(charArray));
        stringBubblesort.sort(charArray);
        System.out.println("Sorted char array: " + Arrays.toString(charArray));
    }
}
