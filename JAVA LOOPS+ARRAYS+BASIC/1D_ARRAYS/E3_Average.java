import java.util.Scanner;

public class E3_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of Array at index "+i+": ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}
