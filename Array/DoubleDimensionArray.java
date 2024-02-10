package arrays;
public class DoubleDimensionArray {
    int arr[][];
    public DoubleDimensionArray(int row, int col){
        arr = new int[row][col];
        for(int i = 0; i<arr.length; i++){
            for(int r=0 ; r<arr[i].length; r++){
                arr[i][r]=Integer.MIN_VALUE;
            }

        }
    }

    public void Traverse(){
        try {
            for(int i = 0; i<arr.length; i++){
                for(int r=0 ; r<arr[i].length; r++){
                    System.out.print(arr[i][r]+" ");
                }
                System.out.println();
    
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("No array Exists");
        }
        
    }
    public void Insertion(int locationr, int locationc, int value){
        try {
            if(arr[locationr][locationc]==Integer.MIN_VALUE){
                arr[locationr][locationc] = value;

            }
            else{
                System.out.println("Location already occupied");
            }
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid index");

        }

    }
    public void Accesing(int locationr, int locationc){
        try {
            System.out.println(arr[locationr][locationc]);
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid Index");
        }

    }

    public void Delete(int loacationtodeleter, int loacationtodeletec){
		try{
			arr[loacationtodeleter][loacationtodeletec]=Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Value not found for deleting");
		}
		

	}
    public void print(){
		try{
			for(int i=0;i<arr.length;i++){
                for(int r = 0; r< arr[i].length; r++){
                    System.out.print(arr[i][r]+" ");

                }
                System.out.println();
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Array no longer exists");
		}
		
	}
    public void Search(int searchvalue){
		for(int i=0;i<arr.length;i++){
            for(int r=0;r<arr[i].length;r++){
                if(arr[i][r]==searchvalue){
                    System.out.println("Value found");
                    System.exit(0);
                }

            }
		}
		System.out.println("Value not found");
	}

}
