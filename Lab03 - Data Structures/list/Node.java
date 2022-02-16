package list;

public class Node {
    private int x;
    private Node next;

    public Node(){
        x = 0;
        next = null; // ?
    }

    public Node(int x){
        this.x = x;
        next = null;
    }

    public Node getNext(){
        return next;
    }

    public int getInt(){
        return x;
    }
    
    public void setInt(int x){
        this.x = x;
    }

    public void setNextNode(Node newNext){
        next = newNext;
    }

    public boolean isLastNode(){
        if(next == null){
            return true;
        }else{
            return false;
        }
    }
}
