import java.util.Scanner;


public class HW05P2 {
	public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
	    System.out.print("Please Enter First city : ");
	    String city1=keyboard.nextLine();
	    System.out.print("Please Enter Second city : ");
	    String city2=keyboard.nextLine();
	    System.out.print("Please Enter Third city : ");
	    String city3=keyboard.nextLine();
	    
	if (city1.compareTo(city2)<0 && (city1.compareTo(city3)<0)){
			
		System.out.print(city1);
		if (city2.compareTo(city3)<0) {
			System.out.print("," + city2 + "," + city3);
		    
		}
		else {
			System.out.print("," + city3 + "," + city2 );
		    
		}
	}	
	else if (city1.compareTo(city2)>0 && (city1.compareTo(city3)<0)){
		System.out.print(city2);
		if (city2.compareTo(city3)<0) {
			System.out.print("," + city1 + "," + city3);
			
		}
		else {
			System.out.print("," + city3 + "," +city1);
			
		}
	}	
	else {
		System.out.print(city3);
	    if (city1.compareTo(city2)<0) {
	    	System.out.print("," + city1 + "," + city2);
	    	
	    }
	    else {
	    	System.out.print("," + city2 + "," + city1 );
	    
	    }
	}
	    
	    
	}
}

