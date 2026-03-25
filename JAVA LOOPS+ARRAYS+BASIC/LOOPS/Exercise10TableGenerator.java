import java.util.Scanner;

public class Exercise10TableGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get Table: ");
        int num = input.nextInt();
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(i*num));
        }
    }
}
