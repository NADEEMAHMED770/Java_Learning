public class E3_TriangleValidity {

    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}