
class main {
	static int main(int a, int b) {
		int main;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		} 
		main = a;
		return main;
		}

		public static void main(final String[] args) {
		int main;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		main = main(b, a);
		System.out.println(main);
		}

		static int a, b;

}
