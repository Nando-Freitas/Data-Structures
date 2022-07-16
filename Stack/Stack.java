
public class Stack{

    protected int size = 0;
    protected int capacity;
    protected int[] stack;

    public int getSize(){
        return this.size;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    private void push(Stack stack, int element) throws Exception {
        if(stack.isFull(stack)){
            throw new Exception("Full stack.");
        }
        int size = stack.getSize();
        stack.stack[size] = element;
        stack.setSize(stack.getSize() + 1);
    }

    private int pop(Stack stack) throws Exception {
        if(stack.isEmpty(stack)){
            throw new Exception("Empty stack");
        }
        int removed = stack.stack[stack.getSize() - 1];
        stack.stack[stack.getSize() - 1] = -1;
        stack.setSize(stack.getSize() - 1);
        return removed;
    }

    private int peek(Stack stack) throws Exception {
        if(stack.isEmpty(stack)){
            throw new Exception("Empty stack");
        }
        return stack.stack[stack.getSize() - 1];
    }

    private boolean isEmpty(Stack stack){
        return (stack.getSize() == 0) ? true : false;
    }

    private boolean isFull(Stack stack){
        return (stack.getSize() == stack.getCapacity()) ? true : false;
    }

    private void print(Stack stack){
        System.out.print("[");
        for(int i = 0; i < stack.getSize(); i++){
            System.out.printf(" %s ", stack.stack[i]);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.setCapacity(10);
        stack.stack = new int[stack.getCapacity()];
        try{
            stack.push(stack, 1);
        }catch(Exception e){
            e.getMessage();
        }

        try{
            stack.push(stack, 2);
        }catch(Exception e){
            e.getMessage();
        }
        
        stack.print(stack);

        try{
            System.out.printf("Stack's top: %s \n",stack.peek(stack));
        }catch(Exception e){
            e.getMessage();
        }

        try{
            System.out.printf("Revomed element: %s \n",stack.pop(stack));
        }catch(Exception e){
            e.getMessage();
        }

        stack.print(stack);

        try{
            System.out.printf("Stack's top: %s \n",stack.peek(stack));
        }catch(Exception e){
            e.getMessage();
        }
    }
}