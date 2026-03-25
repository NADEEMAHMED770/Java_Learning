
public class E9_CopyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int b[] = new int[6];
        for (int i=0;i<6;i++){
            b[i]=arr[i];
        }
        for(int value:b){
            System.out.println(value);
        }
        int[] c = arr.clone();
        for(int value:c){
            System.out.println(value);
        }
    }
}
