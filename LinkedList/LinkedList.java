
class LinkedList {

    Node head;

    class Node {
        String name;
        int age;
        String telephone;
        Node next;

        Node(String name, int age, String telephone){
            name = name;
            age = age;
            telephone = telephone;
        }
    }

    public static void LinkedList insert(LinkedList list, String name, int age, String telephone){

        //Cria um novo nó
        Node newNode = new Node(name, age, telephone);
        newNode.next = null;

        //Se a lista ligada é vazia então torne este nó como cabeça
        if(list.head == null){
            list.head = newNode;
        }else{
            //Senão, percorra a lista até a último nó e insira o novo nó nela
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            //Insere um novo nó no último nó
            last.next = newNode;
        }
        //Devolva a lista
        return list;
    }
}