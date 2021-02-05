package Anya_programist.collection.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class QueueTest {
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop(); //Удаляет и возвращает следующий элемент, или возвращает null, если очередь пуста
        greetings.peek(); //Возвращает ссылку на следующий элемент или возвращает null, если очередь пуста
        while (greetings.peek() != null) {
            System.out.print(greetings.pop());
        }

        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<? extends Object> objects = new ArrayList<Object>();


    }
}
