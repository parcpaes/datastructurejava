package LinkedList;

public class DoubleLinkedMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> numbers = new DoublyLinkedList<>();
        numbers.insertAtHead(1);
        numbers.insertAtHead(2);
        numbers.insertAtHead(3);
        numbers.insertAtHead(4);
        numbers.insertAtHead(5);
        numbers.insertAtEnd(9);
        numbers.insertAtEnd(12);
        numbers.deleteTail();
        numbers.print();
    }
}
