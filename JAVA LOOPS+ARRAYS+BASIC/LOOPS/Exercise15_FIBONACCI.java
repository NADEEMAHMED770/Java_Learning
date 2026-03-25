public class Exercise15_FIBONACCI {
    public static void main(String[] args) {
        int noOfTerms = 10;
        int previous = 0;
        int current = 1;
        int next = 0;
        for (int i=1;i<=10;i++){
            if(i==1){
                System.out.println(0);
            }
            else if(i==2){
                System.out.println(1);
            }
            else{
                next = previous+current;
                previous = current;
                current = next;
                System.out.println(next);
            }
        }
    }
}
