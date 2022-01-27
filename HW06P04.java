import java.util.*;
public class HW06P04 {

	public static void main(String[] args) {
		
		double h = height();
		double w = width();
		double a = triangleArea( h ,  w );
		displayArea(a);
	}

		public static double  height( ) {
			System.out.println("Enter height of trinagle ");
			Scanner keyboard = new Scanner(System.in);
			return keyboard.nextDouble();
		}	
		
		public static double width( ) {
			System.out.println("Enter width of traingle ");
			Scanner keyboard = new Scanner(System.in);
			return keyboard.nextDouble();
			
		}
		
		public static double triangleArea( double h , double w  ) {
			 double area = ( w * h )/2;
			 return area;
			
		}
		public static void displayArea ( double a ) {
			System.out.print("the area of triangle : " + a);
			
		}
		
}
	


