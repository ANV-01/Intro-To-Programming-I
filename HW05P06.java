package myproject;
public class HW05P06{         
	//Function to demonstrate printing patter
	    public static void main (String [] args) {
	    
	    	int i, j;
	    	int n = 10;
	    	
	    	//outer loop to handle number of rows
	    	
	    	for(i=0; i<n; i++)
	    	{
	    		// inner loop to handle number of columns 
	    		// values changing based on outer loop
	    		for(j=0; j<=i; j++)
	    		{
	    			//printing stars
	    			System.out.print("* ");	
	    	  }
	    	  
	    	  // ending line after each row
	    	  System.out.println();
	    		    	
	    }
  }
}