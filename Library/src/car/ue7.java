//Bubble-Sort
public class ue7 {
	static int size = 1000000;
	public static void main (String [] args) {
		int[] array = new int [size];
		int j, buffer;
		
		for (int i=0;i<size;i++) {
			array[i] = (int) ((Math.random() * 10000) +1);
		}
		
		System.out.println("Start");
		
		/*
		for (int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
		*/
		System.out.println("\n");
		
		for (int i=0;i<1000;i++) {
			
			for(int e=0;e<size-1;e++) {
				j = e+1;
				if (array[j] <= array[e]) {
					buffer = array[j];
					array[j] = array[e];
					array[e] = buffer;
				}
				
			}
		}
		/*for (int i=0;i<size;i++) {
			System.out.println(array[i]);
		}*/
		System.out.println("Fertig");
	}
}