package java_hw_8.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("The Queue is empty");
        boolean empty = queue.isEmpty();
        System.out.println(empty);

        System.out.println("We adding some elements in the queue");
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");

        System.out.println(queue);

        System.out.println("The size of queue");
        System.out.println(queue.size());

        System.out.println("The first element of queue:");
        System.out.println(queue.element());

        System.out.println("The first element of queue again:");
        System.out.println(queue.peek());

        System.out.println("The first element of queue with deleting this element");
        System.out.println(queue.remove());

        System.out.println("Now the size of queue:");
        System.out.println(queue.size());

        System.out.println("Now the next first elemet in the queue:");
        System.out.println(queue.poll());

        System.out.println("New size of the queue:");
        System.out.println(queue.size());

        System.out.println("New next first elemet in the queue:");
        System.out.println(queue.poll());

        System.out.println("New size of the queue:");
        System.out.println(queue.size());

        System.out.println("New next first elemet in the queue:");
        System.out.println(queue.poll());

        System.out.println("New size of the queue:");
        System.out.println(queue.size());

        System.out.println("New next first elemet in the queue:");
        System.out.println(queue.poll());

        System.out.println("New size of the queue:");
        System.out.println(queue.size());

        System.out.println("If queue is empty system return null");
        System.out.println(queue.poll());

        System.out.println("We adding new elements in the queue");
        queue.offer("Book");
        queue.offer("Pen");
        queue.offer("iPhone");
        queue.offer("Tablet");
        queue.offer("TV");


        for (String value:queue){
            System.out.println(value);
        }
    }

}
