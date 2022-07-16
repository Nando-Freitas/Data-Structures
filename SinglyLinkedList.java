//import Node.java;

public class SinglyLinkedList{

    protected Node head;
    protected Node tail;
    protected int size;

    public Node getHead(){
        return this.head;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void setTail(Node tail){
        this.tail = tail;
    }

    private void insertHead(SinglyLinkedList singlyLinkedList, String element){
        Node newNode = new Node();
        newNode.setElement(element);

        if(singlyLinkedList.isEmpty(singlyLinkedList)){
            newNode.setNext(null);
            singlyLinkedList.setTail(newNode);
        }else{
            newNode.setNext(singlyLinkedList.getHead());
        }
        singlyLinkedList.setHead(newNode);
        int newSize = singlyLinkedList.getSize() + 1;
        singlyLinkedList.setSize(newSize);
    }

    private void insertTail(SinglyLinkedList singlyLinkedList, String element){
        Node newNode = new Node();
        newNode.setElement(element);

        if(singlyLinkedList.isEmpty(singlyLinkedList)){
            newNode.setNext(null);
            singlyLinkedList.setHead(newNode);
            singlyLinkedList.setTail(newNode);
        }else{
            singlyLinkedList.getTail().setNext(newNode);
            newNode.setNext(null);
            singlyLinkedList.setTail(newNode);
        }
        int newSize = singlyLinkedList.getSize() + 1;
        singlyLinkedList.setSize(newSize);
    }
    
    private String remove(SinglyLinkedList singlyLinkedList) throws Exception{
        if(singlyLinkedList.isEmpty(singlyLinkedList)){
            throw new Exception("List is already empty");   
        }
        String removedElement = singlyLinkedList.getHead().getElement();
        if(singlyLinkedList.getSize() == 1){
            singlyLinkedList.setHead(null);
            singlyLinkedList.setTail(null);
        }else{
            singlyLinkedList.setHead(singlyLinkedList.getHead().getNext());
        }
        int newSize = singlyLinkedList.getSize() - 1;
        singlyLinkedList.setSize(newSize);
        
        return removedElement;
    }

    private void print(SinglyLinkedList singlyLinkedList) throws Exception{
        if(singlyLinkedList.isEmpty(singlyLinkedList)){
            throw new Exception("Empty List.");
        }
        Node auxNode = new Node();
        auxNode = singlyLinkedList.getHead();
        System.out.print("[");
        while(auxNode != null){
            System.out.printf(" %s ", auxNode.getElement());
            auxNode = auxNode.getNext();
        }
        System.out.println("]");
    }

    private void insertElementsHead(SinglyLinkedList singlyLinkedList){
        singlyLinkedList.insertHead(singlyLinkedList, "20");
        singlyLinkedList.insertHead(singlyLinkedList, "100");
        singlyLinkedList.insertHead(singlyLinkedList, "45");
    }

    private void insertElementsTail(SinglyLinkedList singlyLinkedList){
        singlyLinkedList.insertTail(singlyLinkedList, "30");
        singlyLinkedList.insertTail(singlyLinkedList, "200");
        singlyLinkedList.insertTail(singlyLinkedList, "75");
    }

    private void removeElements(SinglyLinkedList singlyLinkedList){
        int i = 0;
        while(i < 3){
            try{
                System.out.printf("\nRemoved element: %s \n", singlyLinkedList.remove(singlyLinkedList));
            }catch(Exception e){
                e.getMessage();
            }
            i++;
        }
    }

    private boolean isEmpty(SinglyLinkedList singlyLinkedList){
        return (singlyLinkedList.getSize() == 0) ? true : false;
    }

    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("\n Insert elements at the head: \n");
        singlyLinkedList.insertElementsHead(singlyLinkedList);

        try{
            singlyLinkedList.print(singlyLinkedList);
        }catch(Exception e){
            e.getMessage();
        }

        System.out.println("\n Insert elements at the tail: \n");
        singlyLinkedList.insertElementsTail(singlyLinkedList);

        try{
            singlyLinkedList.print(singlyLinkedList);
        }catch(Exception e){
            e.getMessage();
        }

        singlyLinkedList.removeElements(singlyLinkedList);

        System.out.println("\n After remove two times: \n");
        try{
            singlyLinkedList.print(singlyLinkedList);
        }catch(Exception e){
            e.getMessage();
        }
    }
}