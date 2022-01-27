import java.util.Scanner;
public class HW04P01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int present, passing, future;
        String currentresult, futureresult;

        System.out.println("What day is it today? (Sunday (0)-Saturday(6)");
        present = input.nextInt();

        System.out.println("How many days from today?");
        passing = input.nextInt();

        if (present == 0) {
            currentresult = "Sunday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 1) {
            currentresult = "Monday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 2) {
            currentresult = "Tuesday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 3) {
            currentresult = "Wednesday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 4) {
            currentresult = "Thursday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 5) {
            currentresult = "Friday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present == 6) {
            currentresult = "Saturday";
            System.out.print("Today is " + currentresult + " the ");
        } else if (present >= 7) {
            System.out.println("Please enter in a valid input for the present day");
            System.exit(1);
        }

        future = present + passing;

        if (future % 7 == 0) {
            futureresult = "Sunday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 1) {
            futureresult = "Monday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 2) {
            futureresult = "Tuesday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 3) {
            futureresult = "Wednesday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 4) {
            futureresult = "Thursday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 5) {
            futureresult = "Friday";
            System.out.print("future day is " + futureresult);
        } else if (future % 7 == 6) {
            futureresult = "Saturday";
            System.out.print("future day is " + futureresult);
        }

    }
}