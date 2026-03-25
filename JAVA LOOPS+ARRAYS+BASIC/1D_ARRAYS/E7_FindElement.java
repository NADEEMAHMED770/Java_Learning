import java.util.Scanner;

public class E7_FindElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of Array at index "+i+": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter a number you want to find: ");
        int find = input.nextInt();
        boolean found = true;
        for(int i=0;i<n;i++){
            if(find==arr[i]){
                System.out.println(find+" is Found at "+i+" index.");
                found = true;
                break;
            }
            if(!found){
                System.out.println(find+" is not Found.");
            }
        }
    }
}
