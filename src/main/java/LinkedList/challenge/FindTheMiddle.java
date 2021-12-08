package LinkedList.challenge;

import LinkedList.SinglyLinkedList;

public class FindTheMiddle {
    public static <T> T findMiddle(SinglyLinkedList<T> list){
        if(list.isEmpty()) return null;
        SinglyLinkedList.Node slow = list.headNode,
                fast = list.headNode.nextNode;
        while(fast!=null && fast.nextNode!=null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return (T) slow.data;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtEnd(7);
        list.insertAtEnd(14);
        list.insertAtEnd(10);
        list.insertAtEnd(21);
        list.insertAtEnd(22);
        list.insertAtEnd(24);
        list.insertAtEnd(28);
        System.out.println(findMiddle(list));
    }
}
