import java.util.Scanner;

public class Exercise03EvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i=1;i<num;i++){
            System.out.println(i);
        }
        int sum =0;
        for (int i=1;i<num;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("Even Numbers Sum: "+sum);
    }
}
