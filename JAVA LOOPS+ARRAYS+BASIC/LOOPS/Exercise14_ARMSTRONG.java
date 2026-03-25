public class Exercise14_ARMSTRONG {
    public static void main(String[] args) {
        int num = 974;
        int copynum = num;
        int ccnum = num;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }

        int rnum = 0;
        int result = 0;
        int snum = 0;
        while(copynum!=0){
            rnum = copynum%10;
            copynum = copynum/10;
            snum = 1;
            for(int i=1;i<=count;i++){
                snum *= rnum;
            }
            result += snum;
        }
        System.out.println("Original Number: "+ccnum);
        System.out.println("Total Digits: "+count);
        System.out.println("Result: "+result);
        if(result == ccnum){
            System.out.println(ccnum+" is an Armstrong Number");
        } else {
            System.out.println(ccnum+" is not an Armstrong Number");
        }

    }
}
