package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
//        list.insertAtEnd(5);

//        boolean f = list.insertAfter(3,99);
        System.out.println("---");
        list.print();
        System.out.println("reverse");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        ListIterator<Integer> iterator = integers.listIterator(integers.size());

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
