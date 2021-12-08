package LinkedList.challenge;

import LinkedList.SinglyLinkedList;

import java.util.HashSet;

public class UnionAndIntersection {
   public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2){
      HashSet<T> set =  new HashSet<>();
      SinglyLinkedList<T> unionList= new SinglyLinkedList<>();
      copyList(list1, unionList,set);
      copyList(list2,unionList,set);
      return unionList;
   }

   private static <T> void copyList(SinglyLinkedList<T> list, SinglyLinkedList<T> result, HashSet<T> set) {
      SinglyLinkedList<T>.Node currentNode = list.headNode;
      while(currentNode !=null){
         if(!set.contains(currentNode.data)) {
            set.add(currentNode.data);
            result.insertAtEnd(currentNode.data);
         }
         currentNode=currentNode.nextNode;
      }
   }

   public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2){
      HashSet<T> set = new HashSet<>();
      SinglyLinkedList<T> intersectionList =new SinglyLinkedList<>();
      SinglyLinkedList<T>.Node currentNode = list1.headNode;
      while(currentNode!=null){
         if(!set.contains(currentNode.data)){
            set.add(currentNode.data);
         }
         currentNode=currentNode.nextNode;
      }

      currentNode = list2.headNode;
      while(currentNode!=null){
         if(set.contains(currentNode.data)){
            intersectionList.insertAtHead(currentNode.data);
         }
         currentNode=currentNode.nextNode;
      }
      return intersectionList;
   }

   public static void main(String[] args) {
      SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
      SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
      list1.insertAtEnd(15);
      list1.insertAtEnd(22);
      list1.insertAtEnd(8);

      list2.insertAtEnd(7);
      list2.insertAtEnd(14);
      list2.insertAtEnd(22);
//      SinglyLinkedList<Integer> result = union(list1,list2);
      SinglyLinkedList<Integer> intersectionList = intersection(list1,list2);
      intersectionList.print();
   }
}