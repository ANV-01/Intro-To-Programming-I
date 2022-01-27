import java.util.*;
public class HW06P05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String s = keyboard.nextLine();
		System.out.print("Enter a character : ");
		char ch = keyboard.nextLine().charAt(0);
		
		 
		
		
		System.out.print("number of  of  " +   ch   + " in the  " +  s + " is " + count(s,ch ));
	}
		
		public static int count(String str, char a) {
			int count = 0 ;
			for (int i = 0 ;i <str.length() ; i++) {
				if (str.charAt(i) == a ) 
			count++;
			}
			
		return count;
			
		}

	}


