package programmer.zaman.now.collection;

import programmer.zaman.now.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        System.out.println(queue.offer("Fathin"));
        System.out.println(queue.offer("Musthafa"));
        System.out.println(queue.offer("Habiburrahman"));

        System.out.println(queue.size());

        // mengambil tanpa hapus
        System.out.println(queue.peek());

        // mengambil lalu hapus
        System.out.println(queue.poll());

        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
