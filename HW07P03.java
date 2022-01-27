import java.util.*;
public class HW07P03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many random integers (between 1 and 4) do you want in the array?: ");
        int num = sc.nextInt();

        int[] numlist = new int[num];
        for (int i = 0; i < numlist.length; i++)
        {
            numlist[i] = r.nextInt(10)%4 + 1;
        }
        boolean flag = false;
        for(int i = 0; i < num-1; i++)
        {
            if(numlist[i] == numlist[i+1] && !flag)
            {
                flag = true;
                System.out.print("(");
            }
            System.out.print(numlist[i]+" ");
            if(numlist[i] != numlist[i+1] && flag)
            {
                flag = false;
                System.out.print(")");
            }
            if(flag && i == num-2)
            {
                System.out.print(numlist[i+1]+")");
            }
            else if(i == num-2)
            {
                System.out.print(numlist[i+1]);
            }
        }
    }

}