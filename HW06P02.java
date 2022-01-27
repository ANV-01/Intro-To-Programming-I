import java.util.Scanner;
public class HW06P02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number of lines : ");
		int numRows = keyboard.nextInt();
		
		

		for (int i = 1 ; i<=numRows; i++) {
			for ( int space = 1 ; space <=(numRows- i)*2 ; space++) {
				System.out.print(  " " );
			}
			for ( int x = i; x>=1 ; x--) {
				System.out.print(  " " + x);
			}
			for ( int x =2; x<=i ;x++ ){
				System.out.print(  " " + x);
			}
			
			System.out.println();
			
			}
		
			}
			
		
		
	}


