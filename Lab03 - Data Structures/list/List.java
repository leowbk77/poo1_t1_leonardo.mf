package list;

import list.Node;

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
            newNode.setNextNode(head);
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

    public int size(){
        return size;
    }

    public void insert(int pos, int valor){
        if(size > pos){
            Node tempNode = head;
            Node newNode = new Node(valor);
            int i = 0;

            while(tempNode.getNext() != null && i < pos){ // -1?
                tempNode = tempNode.getNext();
                i++;
            }

            newNode.setNextNode(tempNode.getNext());
            tempNode.setNextNode(newNode);
            size++;
        }else if(size == pos){
            push_back(valor);
        }
    }
    
    public void pop_front(){
        if(size == 0){
            return;
        }else if(size == 1){
            head = null;
            tail = null;
            size = 0;
        }else{
            head = head.getNext();
            size--;
        }
    }

    public void pop_back(){
        if(size == 0){
            return;
        }else if(size == 1){
            head = null;
            tail = null;
            size = 0;
        }else{
            Node aux = head;
            while(aux.getNext() != tail){
                aux = aux.getNext();
            }
            tail = aux;
            size--;
        }
    }
    
    public int front(){
        return head.getInt();
    }

    public int back(){
        return tail.getInt();
    }

    public void print(){
        Node aux = head;
        while(aux.getNext() != null){
            System.out.println(aux.getInt());
            aux = aux.getNext();
        }
    }

}
