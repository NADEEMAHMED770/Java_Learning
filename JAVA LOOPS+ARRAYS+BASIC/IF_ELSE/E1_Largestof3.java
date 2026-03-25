public class E1_Largestof3 {
    public static void main(String[] args) {
        int a = 10,b=90,c=400;
        if(a>b && a>c){
            System.out.println(a+" is greater.");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater.");
        }
        else{
            System.out.println(c+" is greater.");
        }
    }
}
