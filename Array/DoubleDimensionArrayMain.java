import arrays.DoubleDimensionArray;
public class DoubleDimensionArrayMain {
    public static void main(String[] args) {
        DoubleDimensionArray obj = new DoubleDimensionArray(3 , 3);
        obj.Traverse();
        obj.Insertion(0, 0,  85);
        obj.Insertion(0, 1,  35);
        obj.Insertion(0, 2,  47);
        obj.Insertion(1, 0,  96);
        obj.Insertion(1, 1,  32);
        obj.Insertion(1, 2,  88);
        obj.Insertion(2, 0,  14);
        obj.Insertion(2, 1,  75);
        obj.Insertion(2, 2,  58);
        System.out.println();
        obj.Traverse();
        System.out.println();
        obj.Accesing(0, 2);
        obj.Accesing(2, 0);
        System.out.println();
        obj.Delete(0, 1);
        obj.Delete(2, 2);
        obj.print();
        System.out.println();
        obj.Search(99);
        obj.Search(96);

    }
}
