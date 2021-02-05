package Anya_programist.collection;

import java.util.*;
import java.util.regex.*;

import static java.lang.StrictMath.E;

public class Resetting {
    public static void main(String[] args) {
            Box<Integer> integerBox = new Box<>(15);
            Number number = integerBox.getContents(); // строка 4
            System.out.println(number.getClass().getSimpleName());
    }
}

class Box<T> {
    private T contents;
    public Box(T contents) {
        this.contents = contents;
    }
    public T getContents() {
        return contents;
    }
    public void setContents(T contents) {
        this.contents = contents;
    }
}



