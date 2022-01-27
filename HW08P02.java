import java.util.*;
import java.lang.Math;
public class HW08P02 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows and columns of the array: ");
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int columns = in.nextInt();

        double[][] array = new double[rows][columns];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0 + Math.round(Math.random() * 100.0)/100.0;
                System.out.print("," + array[i][j] + " ");
            }

            System.out.println("]" + ",");
            System.out.println();
        }
        int arr[] = largest(array);
        System.out.println("The location of the largest element is at (" + arr[0] + "," + arr[1] + ")");

    }

    private static int[] largest(double[][] array) {
        int sum [] = new int[2];
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
}


		