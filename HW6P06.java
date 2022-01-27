import java.util.Scanner;

public class HW6P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        boolean valid = validatePassword(password);

        if(valid) {
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean validatePassword(String password){
        int digits = 0;

        if (password.length() < 8){
            return false;
        }

        for (int i = 0; i < password.length(); i++){
            if(!(Character.isDigit(password.charAt(i)))){
                return false;
            }
            if((Character.isDigit(password.charAt(i)))){
                digits = digits + 1;
            }
        }
        if (digits >= 2){
            return true;}
        else{
            return false;
        }
    }
}