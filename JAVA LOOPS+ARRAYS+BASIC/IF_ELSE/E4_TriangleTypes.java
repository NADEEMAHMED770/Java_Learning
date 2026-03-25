public class E4_TriangleTypes {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
            // System.out.println("Valid Triangle");
            if(side1==side2 && side1==side3 && side2==side3){
                System.out.println("Equaleteral Triangle");
            }
            else if(side1==side2 || side1==side3 || side2==side3){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scelene Triangle");
            }
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
