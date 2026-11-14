package java_hw_8.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Our collection is empty");
        System.out.println(deque.isEmpty());

        System.out.println("Adding some element in deque");
        deque.addFirst("Rosa");
        deque.addLast("Pion");
        deque.addLast("Sunflower");
        deque.addLast("Daisy");
        deque.addLast("Lily");

        System.out.println(deque);

        System.out.println("Size our collection:");
        System.out.println(deque.size());

        System.out.println("It is the first element in the collection:");
        System.out.println(deque.getFirst());

        System.out.println("It is the last element in the collection:");
        System.out.println(deque.getLast());

        System.out.println("Return last element without deleting");
        System.out.println(deque.peekLast());

        System.out.println("Return first element and delete it");
        System.out.println(deque.pollFirst());

        System.out.println("Find and remove Pion");
        System.out.println(deque.removeFirstOccurrence("Pion"));
        System.out.println("Demonsrate what kind of flowers in the collection");
        System.out.println(deque);


    }
}
