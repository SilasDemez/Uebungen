package fallmerayer.exceptions.beispiele;

class MyException1 extends Exception {
	MyException1() {
	}

	MyException1(final Throwable cause) {
		super(cause);
	}
}

class MyOtherException extends Exception {
}

public final class ExceptionTest6 {

	private ExceptionTest6() {

	}

	void test(final int i) throws MyException1 {
		try {
			switch (i) {
			case 1:
				throw new MyException1();
			case 2:
				throw new MyOtherException();
			}
		} catch (final MyOtherException e1) {
			throw new MyException1(e1);
		}
	}

	public static void main(final String[] args) {
		if (args.length != 1) {
			System.out.println("Bitte genau ein Argument uebergeben!");
		} else {
			final ExceptionTest6 et = new ExceptionTest6();
			try {
				et.test(Integer.parseInt(args[0]));
			} catch (final MyException1 e) {
				System.out.println(e);
			} finally {
				System.out.println("finally wurde erreicht");
				// Zusaetzlicher sinnvoller Code
			}
		}
	}
}