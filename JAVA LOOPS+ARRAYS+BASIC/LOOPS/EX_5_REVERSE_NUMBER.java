public class EX_5_REVERSE_NUMBER {
    public static void main(String[] args) {
        int num = 73411;
        int rnum = 0;
        while(num!=0){
            rnum = (rnum*10) + num%10;
            num = num/10;
            System.out.println("Inside Loop");
        }
        System.out.println("RNUM: "+rnum);
    }
}