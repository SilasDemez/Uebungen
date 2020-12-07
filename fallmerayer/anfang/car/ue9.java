import java.util.Scanner;

public class ue9 {
	private static Scanner read;
	public static void main(String [] args) {
		int size = 2, limiter = 0;
		float[] array = new float [size];
		for(int i=0; i!= -1;i++) {
			if (i == array.length-1) {
				size++;
				float[] array1 = new float [size];
				System.arraycopy(array, 0, array1, 0, size-1);
				size++;
				array = new float [size];
				System.arraycopy(array1, 0, array, 0, size-1);
			}
			array[i] = eingabe("Bitte gib eine Kommazahl ein");
			if (array[i] < 0 ) { 
				limiter = i;
				break;
			}

		}
		
		System.out.println("Ihre Kommazahlen:");
		
		for(int i=0; i<limiter; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Min: " + min(array, limiter));
		System.out.println("Max: " + max(array, limiter));
		System.out.println("Mittelwert: " + mittelwert(array, limiter));
		System.out.println("Median: " + median(array,limiter));
	}
	
	public static float eingabe(String message) {
		read = new Scanner(System.in);
		System.out.println(message);
		float zahl = read.nextFloat();
		return zahl;
	}


	public static float min (float array[], int limiter) {
		float min = Integer.MAX_VALUE;
		for(int i=0; i<limiter;i++) {
			if (array[i] <= min) min = array[i];
		}
		return min;
	}
	
	public static float max (float array[], int limiter) {
		float max = Integer.MIN_VALUE;
		for(int i=0; i<limiter;i++) {
			if (array[i] >= max) max = array[i];
		}
		return max;
	}
	
	public static float mittelwert (float array[], int limiter) {
		float mittelwert=0;
		for(int i=0; i<limiter;i++) {
			mittelwert += array[i];
		}
		mittelwert /= limiter;
		return mittelwert;
	}

	public static float median (float array[], int limiter) {
		float buffer;
		int j,median;
		//Bubble-Sort
		for (int i=0;i<1000;i++) {
			
			for(int e=0;e<limiter-1;e++) {
				j = e+1;
				if (array[j] <= array[e]) {
					buffer = array[j];
					array[j] = array[e];
					array[e] = buffer;
				}
				
			}
		}
		
		median = limiter/2;
		buffer = array[median];
		
		return buffer;
	}
}
