package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        //tumpukan dari akhir ke awal
        //tampilnya dari awal dlu
        stack.offerLast("Fathin");
        stack.offerLast("Musthafa");
        stack.offerLast("Habib");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        //antrian
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Fathin");
        queue.offerLast("Musthafa");
        queue.offerLast("Habiburrahman");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
