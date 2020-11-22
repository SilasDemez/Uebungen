import java.util.Scanner;
public class ue8 {
	private static Scanner read;

	public static void main (String [] args) {
		int a = readNumber("Geben Sie eine Zahl ein: ");
		System.out.println("Du hast " + a + " eingegeben");
	}
	
	public static int readNumber(String message) {
		read = new Scanner(System.in);
		System.out.println(message);
		int zahl = read.nextInt();
		return zahl;
		
	} 
}