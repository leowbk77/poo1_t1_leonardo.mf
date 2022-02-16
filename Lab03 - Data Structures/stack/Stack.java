package stack;

import list.List;

public class Stack {
    List lista;

    public Stack(){
        lista = new List();
    }

    public void push(int valor){
        lista.push_back(valor);
    }

    public int size(){
        return lista.size();
    }

    public void pop(){
        lista.pop_back();
    }

    public int top(){
        return lista.back();
    }

    public void print(){
        lista.print();
    }
}
