package LinkedList;

public class DoublyLinkedList<T> {
    public class Node{
        public T data;
        public Node nextNode;
        public Node prevNode;
        public Node(T data){
            this.data = data;
        }
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedList(){
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(headNode==null && tailNode==null) return true;
        return false;
    }

    public Node getHeadNode(){
        return headNode;
    }

    public Node getTailNode(){
        return tailNode;
    }

    public void insertAtHead(T data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            headNode= newNode;
            tailNode = headNode;
            return;
        }
        headNode.prevNode = newNode;
        newNode.nextNode=headNode;
        headNode = newNode;
    }

    public void insertAtEnd(T data){
        if(isEmpty()){
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        tailNode.nextNode = newNode;
        newNode.prevNode = tailNode;
        tailNode=newNode;
        size++;
    }

    public void deleteAtHead(){
        if(isEmpty()) return;
        headNode=headNode.nextNode;
        if(headNode==null)
            tailNode=null;
        else
            headNode.prevNode=null;
        size--;
    }

    public void deleteTail(){
        if(isEmpty()) return;
        tailNode = tailNode.prevNode;
        if(tailNode==null){
            tailNode=null;
        }else{
            tailNode.nextNode=null;
        }
        size--;
    }

    public void deleteByValue(T data){
        if(isEmpty()) return;
        Node currentNode = headNode;
        if(currentNode.data.equals(data)){
            deleteAtHead();
            return;
        }
        while(currentNode!=null){
            if(currentNode.data.equals(data)){
                currentNode.prevNode.nextNode=currentNode.nextNode;
                if(currentNode.nextNode!=null){
                    currentNode.nextNode.prevNode=currentNode.prevNode;
                }
                return;
            }
            currentNode=currentNode.nextNode;
        }
    }

    public void print(){
        Node currentNode = headNode;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
    }
}
