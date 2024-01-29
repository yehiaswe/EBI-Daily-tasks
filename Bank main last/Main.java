import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmAtm bmAtm = new BmAtm();
        HsbcAtm hsAtm = new HsbcAtm();
        NbAtm nbAtm = new NbAtm();

        double withdrawamount ;

        double chck;
        int loopFlag = 1;             //////// flag to make the program run while not equal 0

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to our ATM app");
        // Create a Scanner object
        System.out.println("Please select ATM type");
        System.out.println("to choose bm enter 1");
        System.out.println("to choose hsbc enter 2");
        System.out.println("to choose nba enter 3");
        System.out.println("to exit enter 0");
        int AtmType = sc.nextInt();  // Read user input
        while (loopFlag != 0) {

            switch (AtmType) {
                case 1:
                    System.out.println("you choosed bm");////////// replace with implementation
                    break;
                case 2:
                    System.out.println("you choosed hsbc");
                    break;
                case 3:
                    System.out.println("you choosed nba");
                    break;
                case 0:
                    System.out.println(" your program is closed ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("atm not found");
            }
            sc = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your id");
            int customerId = sc.nextInt();  // Read user input
            //////check if id exists and what bank belongs to
            ////////////////////////////////////////////////////////////
            sc = new Scanner(System.in);  // Create a Scanner object
            System.out.println("what operation you want to do");
            System.out.println("to deposit enter 1");
            System.out.println("to withdraw enter 2");
            System.out.println("to check balance enter 3");
            System.out.println("to exit enter 0");

            int operationNo = sc.nextInt();  // Read user input
            int idbanktype = customerId;

            while (idbanktype >= 10) {/////take first digit
                idbanktype /= 10;
            }
            switch (operationNo) {
                case 1:
                    System.out.println("you choosed deposit");
                    sc = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter amount you want to deposit");
                    double depositamount = sc.nextInt();  // Read user input
                    if (idbanktype == 1) {
                        bmAtm.deposit(depositamount, customerId);
                    } else if (idbanktype == 2) {
                        hsAtm.deposit(depositamount, customerId);
                    } else if (idbanktype == 3) {
                        nbAtm.deposit(depositamount, customerId);
                        ;
                    }
                    System.out.println("deposit succsess");
                    break;
                case 2:
                    System.out.println("you choosed withdraw");
                    sc = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter amount you want to withdraw");
                    withdrawamount = sc.nextInt();  // Read user input
                    if (idbanktype == 1) {
                        bmAtm.withdraw(withdrawamount,customerId) ;
                        bmAtm.reconcilement(AtmType,withdrawamount);
                    } else if (idbanktype == 2) {
                        hsAtm.withdraw(withdrawamount,customerId) ;
                        hsAtm.reconcilement(AtmType,withdrawamount);
                    } else if (idbanktype == 3) {
                        nbAtm.withdraw(withdrawamount,customerId) ;
                        nbAtm.reconcilement(AtmType,withdrawamount);
                    }
                    break;
                case 3:
                    System.out.println("you choosed check balance");
                    if (idbanktype == 1) {
                        chck = bmAtm.checkBalance(customerId);
                        System.out.println(chck);
                    } else if (idbanktype == 2) {
                        chck = hsAtm.checkBalance(customerId);
                        System.out.println(chck);
                    } else if (idbanktype == 3) {
                        chck = nbAtm.checkBalance(customerId);
                        System.out.println(chck);
                    }
                    break;
                case 0:
                    System.out.println("you choosed exit");
                    loopFlag = 0;
                    break;
                default:
                    System.out.println("you did not choose operation");
            }


        }





    }
}