package node;


public class DoubleNode {

    private int value ;
    private DoubleNode prev;
    private DoubleNode next;

    public int getValue(){
        return this.value;
    }

    public DoubleNode getPrev(){
        return this.prev;
    }

    public DoubleNode getNext(){
        return this.next;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void setPrev(DoubleNode prev){
        this.prev = prev;
    }
    public void setNext(DoubleNode next){
        this.next = next;
    }
    
    
}
