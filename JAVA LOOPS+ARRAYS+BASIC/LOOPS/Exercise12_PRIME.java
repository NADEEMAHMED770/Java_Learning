import java.util.Scanner;

public class Exercise12_PRIME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factors= 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors++;
            }
        }
        System.out.println(factors);
        if(factors<=2){
            System.out.println(num+ " is a Prime Number");
        }
        else{
            System.out.println(num+ " is not a Prime Number");
        }
    }
}
