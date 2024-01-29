import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmAtm bmAtm=new BmAtm();
        HsbcAtm hsAtm=new HsbcAtm();
        NbAtm nbAtm=new NbAtm();
        AtmOperation p =new AtmOperation();
        double chck;
        int loopFlag=1;             //////// flag to make the program run while not equal 0


        System.out.println("welcome to our ATM app");
        while(loopFlag!=0)
        {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please select ATM type");
            System.out.println("to choose bm enter 1");
            System.out.println("to choose hsbc enter 2");
            System.out.println("to choose nba enter 3");
            int AtmType = myObj.nextInt();  // Read user input
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
                default:
                    System.out.println("atm not found");
            }
            myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your id");
            int customerId = myObj.nextInt();  // Read user input
            //////check if id exists and what bank belongs to
            ////////////////////////////////////////////////////////////
            myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("what operation you want to do");
            System.out.println("to deposit enter 1");
            System.out.println("to withdraw enter 2");
            System.out.println("to check balance enter 3");
            System.out.println("to exit enter 0");
            int operationNo = myObj.nextInt();  // Read user input
            int idbanktype=customerId;
            while (idbanktype >= 10) {/////take first digit
                idbanktype /= 10;
            }
            switch (operationNo) {
                case 1:
                    System.out.println("you choosed deposit");
                    myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter amount you want to deposit");
                    double depositamount = myObj.nextInt();  // Read user input
                    if(idbanktype==1)
                    {
                        bmAtm.deposit(depositamount,customerId);
                    } else if (idbanktype==2) {
                        hsAtm.deposit(depositamount,customerId);
                    } else if (idbanktype==3) {
                        nbAtm.deposit(depositamount,customerId);;
                    }
                    System.out.println("deposit succsess");
                    break;
                case 2:
                    System.out.println("you choosed withdraw");
                    myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter amount you want to withdraw");
                    double withdrawamount = myObj.nextInt();  // Read user input
                    if(idbanktype==1)
                    {
                        bmAtm.withdraw(withdrawamount,customerId,AtmType,idbanktype);
                    } else if (idbanktype==2) {
                        hsAtm.withdraw(withdrawamount,customerId,AtmType,idbanktype);
                    } else if (idbanktype==3) {
                        nbAtm.withdraw(withdrawamount,customerId,AtmType,idbanktype);;
                    }
                    System.out.println("withdraw succsess");
                    break;
                case 3:
                    System.out.println("you choosed check balance");
                    if(idbanktype==1)
                    {
                        chck= bmAtm.checkBalance(customerId);
                        System.out.println(chck);
                    } else if (idbanktype==2) {
                        chck= hsAtm.checkBalance(customerId);
                        System.out.println(chck);
                    } else if (idbanktype==3) {
                        chck= nbAtm.checkBalance(customerId);
                        System.out.println(chck);
                    }
                    break;
                case 0:
                    System.out.println("you choosed exit");
                    loopFlag=0;
                    break;
                default:
                    System.out.println("you did not choose operation");
            }
        }
    }
}