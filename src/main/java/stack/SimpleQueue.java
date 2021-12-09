package stack;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(6);
        queue.enqueue(11);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(11);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(23);
        System.out.println("head "+queue.top());
        queue.enqueue(7);
        queue.enqueue(65);
        queue.enqueue(9);
        System.out.println("--");
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
