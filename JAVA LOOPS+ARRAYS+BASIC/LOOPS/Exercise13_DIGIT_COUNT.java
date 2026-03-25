import java.util.Scanner;

public class Exercise13_DIGIT_COUNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.print("Enter a digit you want to count: ");
        int fnum = input.nextInt();
        int cnum = num;
        int mnum = 0;
        int count = 0;
        while(num!=0){
            mnum = num%10;
            num = num/10;
            if(mnum==fnum){
                count++;
            }
        }
        System.out.println(fnum+" is appears "+count+" times in "+cnum+".");
    }
}
