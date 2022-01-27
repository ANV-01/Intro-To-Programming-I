import java.util.Scanner;

public class HW05P03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        double total = 0;
        int count = 0;

        System.out.println("Enter an integer. The input ends if it is a 0: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("No numbers are entered except 0!");
            System.exit(1);
        }

        while (num != 0){
            if (num > 0)
                pos++;
            else
                neg++;

            total += num;
            count++;
            num = input.nextInt();
        }

        double avg = total / count;

        System.out.println("The number of positives is: " + pos +
                "\nThe number of negatives is: " + neg +
                "\nThe total is: " + total +
                "\n" + count +
                "\nThe average is: " + avg);

    }
}
