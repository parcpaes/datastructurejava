package LinkedList.challenge;

import LinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static <T> void removeDuplicates(SinglyLinkedList<T> list){
        if(list.isEmpty()) return;
        SinglyLinkedList<T>.Node currentNode = list.headNode, prev=null;
        Set<T> set = new HashSet<>();
        while(currentNode!=null){
            if(!set.contains(currentNode.data)){
                if(prev!=null){
                    prev.nextNode=currentNode;
                }
                set.add(currentNode.data);
                prev=currentNode;
            }
            currentNode = currentNode.nextNode;
        }
        prev.nextNode = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtEnd(7);
        list.insertAtEnd(14);
        list.insertAtEnd(21);
        list.insertAtEnd(14);
        list.insertAtEnd(22);
        list.insertAtEnd(7);
        removeDuplicates(list);
        list.print();
    }
}
