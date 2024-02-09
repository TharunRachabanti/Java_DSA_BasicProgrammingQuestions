package arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int length){
        arr = new int[length];
        for(int i =0; i< arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }

    }
    public void Traverse(){
        try {
            for(int i = 0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array no longer exists");
        }
    }

    public void Insert(int location,int value){
        try {
            if(arr[location]==Integer.MIN_VALUE){
				arr[location]=value;
			}
			else{
				System.out.println("Already it was occupied");
			}
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception4
            System.out.println("Invalid index");

        }

        
    }

    public void Accesing(int cellno){
        try{
            System.out.println(arr[cellno]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }
    public void Search(int searchvalue){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==searchvalue){
				System.out.println("Value found");
				System.exit(0);
			}
		}
		System.out.println("Value not found");
	}
	public void Delete(int loacationtodelete){
		try{
			arr[loacationtodelete]=Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Value not found for deleting");
		}
		

	}
	public void print(){
		try{
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Array no longer exists");
		}
		
	}
}
