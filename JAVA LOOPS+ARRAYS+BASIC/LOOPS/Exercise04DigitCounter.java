import java.util.Scanner;

public class Exercise04DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int counter = 0;
        while(num!=0){
            num = num/10;
            counter++;
        }
        System.out.println("Your Number Contains: "+counter+" digits.");
    }
}
