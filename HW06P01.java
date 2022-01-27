import java.util.Scanner;
public class HW06P01 {

public static void main(String[] args) {
		Scanner keyboard   = new Scanner(System.in);
		System.out.print("Enter a  string : ");
		String word =  keyboard.nextLine();
		
		
		
		String reverseword = " ";
		
		for ( int i = word.length()-1 ; i>=0 ;i--) {
			reverseword = reverseword + word.charAt(i);
			
		}
        System.out.print("The reverse of the string is " + reverseword);
	}

}
