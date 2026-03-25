public class Exercise14P2 {
    public static void main(String[] args) {
        int num = 153;
        int copynum = num;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Total Digits: "+count);
        int rnum = 0;
        int result = 1;
        int snum = 0;
        while(copynum!=0){
            rnum = copynum%10;
            copynum = copynum/10;
            result += snum;
            System.out.println("Result inside While loop: "+result);
            System.out.println("Inside While LOOP");
            for(int i=1;i<=count;i++){
                System.out.println("Inside For LOOP");
                snum *= rnum;
                System.out.println("Result inside for loop: "+snum);
            }
        }
        System.out.println("Result: "+result);

    }
}
