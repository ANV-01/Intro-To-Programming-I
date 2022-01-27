import java.util.Scanner;
public class HW06P03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a value of n : ");
		int line = keyboard.nextInt();
		matrix(line);

	}
   public static void matrix(int line ) {
	   for (int i = 0 ; i < line ; i++) {
		   for  (int x = 0 ; x < line ; x++) {
		   System.out.print((int)(Math.random()*2)+" ");
	   }
   System.out.println();
   }
   }
   
   

}
