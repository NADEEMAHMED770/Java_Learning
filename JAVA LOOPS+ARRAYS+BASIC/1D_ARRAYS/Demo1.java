public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int value:arr){
            System.out.println(value);
        }
        System.out.println(arr[0]);
        int arr2[] = {5,2,3,4,5};
        System.out.println(arr2[0]);
        int[] numbers = new int[9];
        numbers[0] = 9;
        System.out.println(numbers[3]);
        System.out.println(arr.length);
        System.out.println(numbers.length);
        String name = "Nadeem";
        System.out.println(name.length());

        }
}
