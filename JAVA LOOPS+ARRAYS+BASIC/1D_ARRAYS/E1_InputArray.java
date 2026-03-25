import java.util.Scanner;

public class E1_InputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of array at index: "+i+": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Values of Array You Entered");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
