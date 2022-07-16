
public class Node{

    protected String element;
    protected Node next;

    public String getElement(){
        return this.element;
    }

    public Node getNext(){
        return this.next;
    }

    public void setElement(String element){
        this.element = element;
    }

    public void setNext(Node next){
        this.next = next;
    }
}