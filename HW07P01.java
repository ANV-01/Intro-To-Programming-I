
public class HW07P01 {

	public static void main(String[] args) {
		int [] frequency  = new int[10] ;
		int [] randomNumber = new int [100];
		
		for (int i = 0 ; i<randomNumber.length ;i++) {
			 int number = (int) (Math.random()*10);
			 randomNumber[i]= number ; 
			 frequency[number]++ ; 
		}
		for (int i = 0 ; i < randomNumber.length ; i++ ) {
			System.out.print(randomNumber[i]  );
		}
		
		System.out.println("");
		System.out.print("The number of frequency for 0's to 9's  in the above line are " );
		
		for (int i = 0 ; i < frequency.length ; i++) {
			System.out.print("("+ frequency[i]+", "+i +"s)"  );
		}
		
		}
		
				
		
	}


