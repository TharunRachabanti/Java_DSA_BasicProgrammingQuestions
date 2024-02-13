import LinkedLists.SingleLinkedList;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList obj = new SingleLinkedList();
        obj.traverseLinkedList();
        System.out.println();
        obj.createSingleLinkedList(5);
		obj.traverseLinkedList();
        
		obj.insertInLinkedList(10, 1);
        obj.insertInLinkedList(20, 2);
        obj.insertInLinkedList(30, 3);
        obj.insertInLinkedList(40, 4);
        obj.insertInLinkedList(50, 5);
        obj.insertInLinkedList(60, 6);
        obj.insertInLinkedList(70, 7);
		obj.traverseLinkedList();
        System.out.println();
        System.out.println("\nSearching the node having value 40...");
		obj.searchNode(40);

		System.out.println("\nSearching the node having value 500...");
		obj.searchNode(500);

        

    }

    
}
