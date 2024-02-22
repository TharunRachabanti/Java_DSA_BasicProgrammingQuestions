package LinkedLists;
import node.DoubleNode;

public class DoubleLinkedList {

    DoubleNode head = null;
    DoubleNode tail = null;
    int size;

    public DoubleNode CreateDoubleLinkedList(int nodevalue){
        DoubleNode node = new DoubleNode();
        node.setValue(nodevalue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void Insertion(int value, int location){
        DoubleNode node = new DoubleNode();
        node.setValue(value);
        try {
            if(!isDoublelinkedListExists()){
                System.out.println("No Double Linked List Exists to add");
            }
            else{
                if(location == 0){
                    head.setPrev(node);
                    node.setNext(head);
                    head = node;
                    node.setPrev(null);
                }
                else if(location >= size){
                    tail.setNext(node);
                    node.setPrev(tail);
                    tail = node;
                    node.setNext(null);

                }
                else{
                    DoubleNode tempnode = head;
                    for(int i=0;i<location;i++){
                        tempnode = tempnode.getNext();
                    }
                    node.setPrev(tempnode);
                    node.setNext(tempnode.getNext());
                    tempnode.setNext(node);
                    (node.getNext()).setPrev(node);

                }
            }

            size = size+1;
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("invalidlocation");
        }
        

    }

    public void Deletion(int location){
        if(!isDoublelinkedListExists()){
            System.out.println("Linked List Doesnt exists");
        }
        else{
            if(location ==0){
                if(size == 1){
                    head = null;
                    tail =null;
                }
                else{
                    head = head.getNext();
                    head.setPrev(null);
                }
            }
            else if(location >= size){
                tail = tail.getPrev();
                tail.setNext(null);

            }
            else{
                DoubleNode tempnode = head;
                for(int i =0; i<=location; i++){
                    tempnode = tempnode.getNext();
                }
                (tempnode.getPrev()).setNext(tempnode.getNext());
                (tempnode.getNext()).setPrev(tempnode.getPrev());


            }
            size = size-1;

        }
    }

    public void Traverse(){
        if(!isDoublelinkedListExists()){
            System.out.println("No Double Linked List Exists");
        }
        else{
            DoubleNode temNode = head;
            for(int i =0; i<size; i++){
                System.out.print(temNode.getValue()+" -> ");
                temNode = temNode.getNext();
            }

        }
    }

    boolean isDoublelinkedListExists(){
        if(head!=null){
            return true;
        }
        else {
            return false;
        }
    }





    
}
