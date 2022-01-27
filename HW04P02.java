import java.util.Scanner;
public class HW04P02 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
      
        System.out.print("Enter a floating-point number : ");
       float  number = input.nextFloat();
       if (number > 1000000 && number != 0) {
		   System.out.print( "Large" + ",");
	   }
          else if (number < 1 && number != 0 ){
		   System.out.print("Samll" + ",");
	   }
      
       if(number > 0) {
    	   System.out.println( "Positive");
       }
    	   else if (number < 0) {
    		   System.out.print( "negative");
    	   }
    	   else if (number == 0){
    			   System.out.print("Zero");
    		   }
    	   
	   
		   
	   }
       
       
        
      


   }

