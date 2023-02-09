package PracticalLabTest;

public class Duplicate {

	 public static void main(String[] args) 
	 {
		    String[] arr = new String[]{"box", "pen", "pencil", "pen", "box","eraser","ruler","ruler"}; //creating the strings

		    
		    for (int i = 0; i < arr.length; i++)
		    {
		      for (int j = i + 1; j < arr.length; j++) 
		      {
		        if (arr[i].equals(arr[j])) 
		        {
		          System.out.println("Duplicate string value: " + arr[i]);
		        }
		      }
		    }
		  }
}

