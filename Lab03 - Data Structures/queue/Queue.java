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

}