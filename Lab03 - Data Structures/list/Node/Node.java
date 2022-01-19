package list.Node;

public class Node {
    private int x;
    private Node next;

    public void Node(){
        x = 0;
        next = null; // ?
    }

    public Node getNext(){
        return next;
    }

    public void setInt(int x){
        this.x = x;
    }
}
