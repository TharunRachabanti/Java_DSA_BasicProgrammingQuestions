package LinkedLists;
import node.SingleNode;

public class SingleLinkedList {

    private SingleNode head = null;
    private SingleNode tail = null;
    private int size;// denotes size of list

    public SingleNode createSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;

    }
    public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


    public void insertInLinkedList(int nodeValue, int location){

        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("The linked list does not exist!!");
        }
        else if(location == 0){
            node.setNext(head);
            head = node;
        }
        else if(location >= size){
            node.setNext(null);
            tail.setNext(node);
            tail = node;

        }
        else{
            // Inserting at specified location
            SingleNode tempNode = head;
            for (int i=0; i< location-1 ;i++){
                tempNode = tempNode.getNext(); 

            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);

        }
        setSize(getSize()+1);

    }

    public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

    
	//Traverses Linked List
	public void traverseLinkedList() {
        if(!existsLinkedList()){
            System.out.println("The linked list does not exist!!");
        }
        else{
            SingleNode tempNode = head;
            for(int i = 0; i < getSize(); i++){
                System.out.print(tempNode.getValue());
                if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
                tempNode = tempNode.getNext();


            }

        }
        System.out.println("\n");
    }

    public boolean searchNode(int nodevalue){
        SingleNode temp2node = head;
        for(int i =0; i<getSize();i++){
            if(temp2node.getValue() == nodevalue){
                System.out.print("Found the node at location: "+i+"\n");
                return true;
            }
            temp2node = temp2node.getNext();
        }
        System.out.print("Node not found!! \n");
		return false;
    }

   
    
}


