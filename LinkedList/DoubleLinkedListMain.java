import LinkedLists.DoubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList obj  = new DoubleLinkedList();
        obj.CreateDoubleLinkedList(5);

        obj.Insertion( 14,1);
        obj.Insertion( 54,2);
        obj.Insertion( 67,3);
        obj.Insertion( 87,4);
        obj.Insertion( 23,5);
        obj.Insertion( 77,6);
        obj.Insertion( 98,7);
        obj.Insertion( 33,8);
        obj.Insertion( 11,9);

        System.out.println("After Inserting nodes");
        obj.Traverse();
        System.out.println();
        obj.Deletion(3);
        obj.Deletion(7);
        System.out.println("After  Deleting Elements at location "+3+" and "+7);
        obj.Traverse();



        
    }


    
}
