public class Exercise16_StrongNumber {
    public static void main(String[] args) {
        int num = 40585;
        int cnum = num,ccnum=num;
        int rnum = 0;
        int count = 0;
        int result = 0;
        int fact = 1;
        while(num!=0){
            rnum = num%10;
            num = num/10;
            count++;
        }
        System.out.println("Original Number: "+cnum);
        System.out.println("Total Digits: "+count);

        for(int i=0;i<count;i++){
            rnum = cnum%10;
            cnum = cnum/10;
            fact = 1;
            if(rnum<=1){
                fact = 1;
            }
            else{
                for(int j=2;j<=rnum;j++){
                    fact *= j;
                }
            }
            result += fact;
        }
        System.out.println("Result: "+result);
        if(result==ccnum){
            System.out.println(result+" is a Strong Number.");
        }
        else{
            System.out.println(result+" is not a Strong Number.");

        }
    }
}
