import java.util.Scanner;

public class E5_CountEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int ecount = 0;
        int ocount = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of Array at index "+i+": ");
            arr[i] = input.nextInt();
            if(arr[i]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("Total Evens: "+ecount);
        System.out.println("Total Odds: "+ocount);
    }
}
