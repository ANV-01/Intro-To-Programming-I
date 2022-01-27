
public class HW05P04 {

	public static void main(String[] args) {
		double tuition = 10000;
		int year ;
		for (  year=0  ; tuition < 20000 ; year++) {
		    tuition = tuition * 1.07;
		  
		}
		   System.out.println("Tuition will be doubled in " + year + " years");
		   System.out.printf("Tuition will be $%.2f in %1d years",  tuition, year);
		

	}
}

