
public class ue5 {

	public static void main(String[] args) {
		int zahl1, zahl2, zahl3, buffer;
		zahl1 = (int) ((Math.random() * 10) +1);
		zahl2 = (int) ((Math.random() * 10) +1);
		zahl3 = (int) ((Math.random() * 10) +1);
		
		System.out.println("Ungeordnet:\n\n");
		System.out.println("Zahl1 " + zahl1 +"\nZahl2 " + zahl2 + "\nZahl3 " + zahl3);
		
		for(int i=0; i<10; i++) {
			if (zahl2 <= zahl1) {
				//Zahl2 ist kleiner als Zahl1
				buffer = zahl2;
				zahl2 = zahl1;
				zahl1 = buffer;
			}
			if (zahl3 <= zahl2) {
				buffer = zahl2;
				zahl2 = zahl3;
				zahl3 = buffer;
			}
		}
		System.out.println("Geordnet:\n\n");
		System.out.println("Zahl1 " + zahl1 +"\nZahl2 " + zahl2 + "\nZahl3 " + zahl3);
		}
	}