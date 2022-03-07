package list;

import list.Node;
import list.ListSizeException;

public class List {
    private Node head;
    private Node tail;
    private int size;

    public List(){
        head = null; // ?
        tail = null;
        size = 0;
    }

    //exception de falta de memoria
    public void push_front(int valor){
        try{
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
        }catch(OutOfMemoryError e){
            System.out.println("Impossível alocar mais espaço para a lista");
        }
    }

    //exception de falta de memoria
    public void push_back(int valor){
        if(size == 0){
            push_front(valor);
        }else{
            try{
                Node newNode = new Node(valor);
                tail.setNextNode(newNode);
                tail = tail.getNext();
                size++;
            }catch(OutOfMemoryError e){
                System.out.println("Impossível alocar mais espaço para a lista");
            }
            
        }
    }

    public int size(){
        return size;
    }

    // parametro invalido/ruim - falta de memoria
    public void insert(int pos, int valor){
        if(pos > size){
            throw new IllegalArgumentException();
        }else{
            if(size == pos){
                push_back(valor);
            }else{
                try{
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
                }catch(OutOfMemoryError e){
                    System.out.println("Impossível alocar mais espaço para a lista");
                }
            }
        }
    }
    
    // criar nova exception? - caso size == 0 ?
    public void pop_front(){
        if(size == 0){
            throw new ListSizeException("A lista tem tamanho zero");
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
            throw new ListSizeException("A lista tem tamanho zero");
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
