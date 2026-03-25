import java.util.Scanner;

public class Exercise02Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Even Numbers");
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers");
        for(int i=0;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
