import java.util.Scanner;

public class HW04P03 {
    public static void main(String[] args){
        int date;
        Scanner day = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 6 indicating the day of the week: ");
        date = day.nextInt();

        switch(date){
            case 0:
                System.out.println("Weekend");
                break;
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Input!");
                System.exit(1);
        }
    }
}
