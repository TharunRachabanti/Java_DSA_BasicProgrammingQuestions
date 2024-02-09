import arrays.SingleDimensionArray;
public class SingleDimensionArrayMain {
    public static void main(String[] args) {

        SingleDimensionArray obj = new SingleDimensionArray(10);
        obj.Traverse();
        obj.Insert(0, 22);
        obj.Insert(1, 88);
        obj.Insert(2, 93);
        obj.Insert(3, 47);
        obj.Insert(4, 98);
        obj.Insert(5, 21);
        obj.Insert(6, 85);
        obj.Insert(7, 44);
        obj.Insert(8, 58);
        obj.Insert(9, 33);

        obj.Traverse();
        obj.Accesing(5);
        obj.Accesing(2);
        System.out.println();
		obj.Delete(9);
       // obj.Traverse();
		obj.print();
        obj.Search(93);

    }   
}
