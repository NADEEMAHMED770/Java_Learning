import java.util.Scanner;

public class E2_SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of array at index "+i+": ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of Your Array is: "+sum);
    }
}
