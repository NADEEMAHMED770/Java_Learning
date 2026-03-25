public class Exercise11_MAX_MIN_DIGIT {
    public static void main(String[] args) {
        int max = -1000000;
        int min = 1000000;
        int rnum = 0;
        int num = 79381;
        while(num!=0){
            rnum = num%10;
            num = num/10;
            if(rnum>=max){
                max = rnum;
            }
            if(rnum<=min){
                min = rnum;
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}
