public class E10_SortArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,1,4};
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] temp = new int[5];
        System.out.println("\nSorted Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    arr[i] = arr[j];
                    arr[j] = temp[i];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            System.out.print(temp[i]+" ");
        }
    }
}
