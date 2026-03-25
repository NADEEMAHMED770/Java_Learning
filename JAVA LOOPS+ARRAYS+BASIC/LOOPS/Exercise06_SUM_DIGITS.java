public class Exercise06_SUM_DIGITS {
    public static void main(String[] args) {
        int num = 2341;
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
