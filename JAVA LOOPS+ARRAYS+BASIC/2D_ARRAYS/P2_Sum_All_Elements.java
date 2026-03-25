import java.util.Scanner;

public class P2_Sum_All_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter the value of row "+i+" column "+j+" : ");
                arr[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        System.out.println("Your Entered Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        int rsum1 = 0;
        int rsum2 = 0;
        int rsum3 = 0;
        int csum1 = 0;
        int csum2 = 0;
        int csum3 = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==0){
                    rsum1 += arr[i][j];
                }
                if(i==1){
                    rsum2 += arr[i][j];
                }
                if(i==2){
                    rsum3 += arr[i][j];
                }
                if(j==0){
                    csum1 += arr[i][j];
                }
                if(j==1){
                    csum2 += arr[i][j];
                }
                if(j==2){
                    csum3 += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum Of All Elements: "+sum);
        System.out.println("Sum Of All Row1 Elements: "+rsum1);
        System.out.println("Sum Of All Row2 Elements: "+rsum2);
        System.out.println("Sum Of All Row3 Elements: "+rsum3);
        System.out.println("Sum Of All Column1 Elements: "+csum1);
        System.out.println("Sum Of All Column2 Elements: "+csum2);
        System.out.println("Sum Of All Column3 Elements: "+csum3);
        
    }
}
