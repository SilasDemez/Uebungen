package fallmerayer.exceptions.beispiele;

class MyException extends Exception {
}

class MyNewException extends MyException {
}

class MyNewExtraException extends MyException {
}

class A {
    public void a() throws MyException {
        throw new MyException();
    }
}

class B extends A {
}

class C extends B {
    @Override
    public void a() throws MyNewException, MyNewExtraException {
        if (Math.random() > 0.5) {
            throw new MyNewException();
        } else {
            throw new MyNewExtraException();
        }
    }
}

public class ExceptionTest4 {

    private ExceptionTest4() {

    }

    public static void main(String[] args) {

        int zahl = 3;
        System.out.println("Test");
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        try {
            switch (zahl) {
                case 1:
                    t1.a();
                    break;
                case 2:
                    t2.a();
                    break;
                case 3:
                    t3.a();
                    break;
                default:
                    throw new MyException();
            }
        } catch (MyNewException e) {
            System.out.println(e);
        } catch (MyException e) {
            System.out.println(e);
        } // catch ...

    }
}
