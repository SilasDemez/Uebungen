package fallmerayer.lamda;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ue1 {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Test");
        runnable.run();

        ActionListener listener = e -> {};

        Supplier<String> supplier = () -> "test";

        Consumer<Point> consumer = point -> {};

        Comparator<Rectangle> comparator = (r1,r2) -> r1.height > r2.height?-1:0;


    }
}
