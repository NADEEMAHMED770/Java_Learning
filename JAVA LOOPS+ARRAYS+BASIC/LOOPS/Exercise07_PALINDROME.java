public class Exercise07_PALINDROME {
    public static void main(String[] args) {
        int num = 121;
        int cnum = num;
        int rnum = 0;
        while(num!=0){
            rnum= (rnum*10) + num%10;
            num = num/10;
        }
        if(rnum==cnum){
            System.out.println(rnum+" is Palindrome.");
        }
        else{
            System.out.println(rnum+" is not Palindrome.");
        }
    }
}
