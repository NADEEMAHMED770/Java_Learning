import java.util.Scanner;

public class E8_FrequencyFind {
    public static void main(String[] args) {
        int[] arr = {1,7,4,7,7,34};
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to count its frequency: ");
        int freq = input.nextInt();
        int counter = 0;
        for(int i=0;i<6;i++){
            if(arr[i]==freq){
                counter++;
            }
        }
        System.out.println(freq+" number apperas "+counter+" times in this array");
    }
}
