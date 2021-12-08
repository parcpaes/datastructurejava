package LinkedList.challenge;

import LinkedList.SinglyLinkedList;

public class DetectLoopList {
    public static <T> boolean detectLoop(SinglyLinkedList<T> list){
        if(list.isEmpty() || list.size()==1)return false;
        SinglyLinkedList.Node slow = list.headNode;
        SinglyLinkedList.Node fast = list.headNode;
        while(slow!=null && fast!=null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtHead(7);
        list.insertAtHead(21);
        list.insertAtHead(14);
        list.insertAtHead(7);
        System.out.println(detectLoop(list));
    }
}
