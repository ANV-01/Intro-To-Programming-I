import java.util.Scanner;
public class HW04P04 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Enter two Chacters : ");
        String status = input.nextLine();
        char major = Character.toUpperCase(status.charAt(0));
        char year = status.charAt(1);
      
        switch (major) {
        case 'M' : System.out.print("Mathematics ");break;
        case 'C' : System.out.print("Computer Science ");break;
        case 'I' : System.out.print("Information Technology ");break;
        default : System.out.print("Invalid input ");break;
        }
        System.exit(1);
        switch (year){
        case '1' : System.out.print(" Freshman ");
        case '2' : System.out.print(" Sophomore ");
        case '3' : System.out.print(" Junior ");
        case '4' : System.out.print(" Junior "); 
        default : System.out.print("Invalid input ");break;        	
        }
        System.exit(1);
        
        
		
        	
        	
    }
        
 }
        
        
        
        
        
       
	
