package LinkedList;

public class SinglyLinkedList<T>{

    public class Node{
        public T data;
        public Node nextNode;//Pointer to next node in list.
        Node(T data){
            this.data = data;
        }
    }

    public Node headNode;
    public Node tail;
    public int size;

    public SinglyLinkedList(){
        headNode = null;
        this.tail = null;
        size=0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return headNode==null;
    }

    public void setInitialNode(Node node){
        headNode = node;
        tail = headNode;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTail() {
        return tail;
    }

    public void insertAtHead(T data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            setInitialNode(newNode);
            return;
        }
        newNode.nextNode = headNode;
        headNode=newNode;
    }

    public void insertAtEnd(T data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            setInitialNode(newNode);
            return;
        }
        tail.nextNode=newNode;
        tail = newNode;
    }

    public boolean insertAfter(T newData,T previous){
        Node current = headNode;
        while(current!=null){
            if(current.data.equals(previous)){
                Node newNode = new Node(newData);
                newNode.nextNode
                        = current.nextNode;
                current.nextNode = newNode;
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    public T deleteAtHead(){
        if(isEmpty()) return null;
        headNode = headNode.nextNode;
        size--;
        return headNode.data;
    }

    public void deleteByValue(T data){
        if(isEmpty()) return ;
        Node currentNode = headNode;
        if(currentNode.data.equals(data)){
            deleteAtHead();
            return;
        }
        Node prevNode=null;
        while(currentNode!=null){
            if(currentNode.data.equals(data)){
                prevNode.nextNode = currentNode.nextNode;
                return;
            }
            prevNode = currentNode;
            currentNode=currentNode.nextNode;
        }
    }

    public boolean searchNode(T data){
        Node currentNode = headNode;
        while(currentNode!=null){
            if(currentNode.data.equals(data)){
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public void print(){
        if(isEmpty()) return;
        Node node = headNode;
        while(node!=null){
            System.out.println(node.data);
             node = node.nextNode;
        }
    }
}
