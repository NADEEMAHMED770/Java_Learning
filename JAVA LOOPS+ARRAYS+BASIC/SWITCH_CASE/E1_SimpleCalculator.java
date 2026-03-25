import java.util.Scanner;

public class E1_SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println("1.Addition\n2.Subtraction\nMultiplication\n4.Division");
        System.out.print("Enter Your Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println(num1+" X "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}