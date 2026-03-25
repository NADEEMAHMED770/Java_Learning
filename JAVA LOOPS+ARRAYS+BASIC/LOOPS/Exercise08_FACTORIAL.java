public class Exercise08_FACTORIAL {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        if(num<=1){
            System.out.println(1);
        }
        else{
            for(int i=2;i<=num;i++){
                fact *= i;
            }
            System.out.println(fact);
        }
    }
}
