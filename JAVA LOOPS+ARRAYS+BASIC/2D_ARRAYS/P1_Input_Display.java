import java.util.Scanner;

public class P1_Input_Display {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter the value of row "+i+" column "+j+" : ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your Entered Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
