import java.util.Scanner;

public class E1_PasswordLimits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "nadeem786";
        int counter = 3;
        while(counter!=0){
            System.out.print("Enter Your Password: ");
            String password = input.nextLine();
            if (password.equals(correctPassword)){
                System.out.println("Login Successful");
                return;
            }
            else{
                System.out.println("Incorrect Password Please Try Again......");
            }
            counter--;
        }
    }
}
