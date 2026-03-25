import java.util.Scanner;

public class E2_ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("============= WELCOME TO YOUR ONLINE ATM MACHINE ==========");
        System.out.println("===========================================================");
        // System.out.println("1.Check Balance\n2.Withdraw Money\n3.Deposit Money\n4.Exit");
        // System.out.print("Enter Your Choice: ");
        // int choice = input.nextInt();
        int currentBalance = 20000;
        while(true){
            System.out.println("1.Check Balance\n2.Withdraw Money\n3.Deposit Money\n4.Exit");
            System.out.print("Enter Your Choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is: "+currentBalance);
                    break;
                case 2:
                    System.out.print("Enter amount you want to withdraw: ");
                    int withdraw = input.nextInt();
                    if(currentBalance>=withdraw){
                        currentBalance -= withdraw;
                        System.out.println(withdraw+" Rupees Withdraw Successfully.");
                        System.out.println("Your Current Balance is: "+currentBalance);
                    }
                    else{
                        System.out.println("Invalid Amount.Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount you want to deposit: ");
                    int deposit = input.nextInt();
                    currentBalance += deposit;
                    System.out.println(deposit+" Rupees Deposited Successfully.");
                    System.out.println("Your Current Balance is: "+currentBalance);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("===========================================================");
                    System.out.println("============= YOUR TRANSACTION SUMMARY ====================");
                    System.out.println("===========================================================");
                    System.out.println("CURRENT BALANCE: "+currentBalance);
                    System.out.println("TOTAL WITHDRAW: "+(20000-currentBalance));
                    System.out.println("TOTAL DEPOSIT: "+(currentBalance-20000));
                    System.out.println("===========================================================");
                    System.out.println("============= THANKS FOR USING OUR SERVICE ================");
                    System.out.println("===========================================================");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
        }
    }
}
