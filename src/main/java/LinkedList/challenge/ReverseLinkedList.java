package LinkedList.challenge;

import LinkedList.SinglyLinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static <T> void reverse(SinglyLinkedList<T> list){
         SinglyLinkedList.Node next = null, prev= null, curr = list.headNode;
         while(curr!=null){
             next = curr.nextNode;
             prev = next;
             curr.nextNode=prev;
             curr = next;
         }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtHead(6);
        list.insertAtHead(4);
        list.insertAtHead(9);
        list.insertAtHead(10);
        reverse(list);
        list.print();

        LinkedList<Integer> a = new LinkedList<>();

    }
}
