import java.util.Scanner;

public class E6_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of Array at index "+i+": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Reversed Array");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
