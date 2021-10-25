import java.lang.Math;
import java.util.Scanner;
public class HW03P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length ");
        double s = input.nextDouble();
        if (s >= 0) {
            System.out.print("Your area is " + hexagonArea(s) + "\n");
        }
        else{
            System.out.print("Length must be a positive #");
        }
    }

    public static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }

}
