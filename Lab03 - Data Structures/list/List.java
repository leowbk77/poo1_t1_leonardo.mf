package list;

import list.Node.Node;

public class List {
    private Node head;
    private Node tail;
    private int size;

    public List(){
        head = null; // ?
        tail = null;
        size = 0;
    }

    public void push_front(int valor){
        if(head == null){
            head = new Node(valor);
            tail = head;
            size++;
        }else{
            Node newNode = new Node(valor);
            tempNode.setNextNode(head);
            head = newNode;
            size++;
        }
    }

    public void push_back(int valor){
        if(size == 0){
            push_front(valor);
        }else{
            Node newNode = new Node(valor);
            tail.setNextNode(newNode);
            tail = tail.getNext();
            size++;
        }
    }

    
    
}
