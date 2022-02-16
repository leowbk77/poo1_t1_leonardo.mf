package queue;

import list.List;

public class Queue{
    private List lista;

    public Queue(){
        lista = new List();
    }

    public void push(int number){
        lista.push_back(number);
    }

    public int size(){
        return lista.size();
    }

    public int pop(){
        int popped = lista.back();
        lista.pop_back();
        return popped;
    }

    public int front(){
        return lista.front();
    }

    public void print(){
        lista.print();
    }
}