import java.util.Scanner;

public class E4_Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int max = -1000000000;
        int min = 1000000000;
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of Array at index "+i+": ");
            arr[i] = input.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        
    }
}
