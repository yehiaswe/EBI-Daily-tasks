import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BmAtm bmatm=new BmAtm();
        bmatm.bmCust[0] = new Customer(11,"Shaalan",1000);
        bmatm.bmCust[1] = new Customer(12,"Mahmoud",500);
        bmatm.bmCust[2] = new Customer(13,"Omnia",900);
        bmatm.bmCust[3] = new Customer(14,"Habiba",2000);
        bmatm.bmCust[4] = new Customer(15,"Monika",100);

        HsbcAtm hsbcatm=new HsbcAtm();                  ///list hsbc customers
        hsbcatm.HsCust[0] = new Customer(21,"Yehia",1000);
        hsbcatm.HsCust[1] = new Customer(22,"Mohamed",500);
        hsbcatm.HsCust[2] = new Customer(23,"Omar",900);
        hsbcatm.HsCust[3] = new Customer(24,"Mariam",2000);
        hsbcatm.HsCust[4] = new Customer(25,"Sara",100);

        NbAtm nbaatm=new NbAtm();
        nbaatm.NbCust[0] = new Customer(31,"Ibrahim",1000);
        nbaatm.NbCust[1] = new Customer(32,"Ahmed",500);
        nbaatm.NbCust[2] = new Customer(33,"Mark",900);
        nbaatm.NbCust[3] = new Customer(34,"John",2000);
        nbaatm.NbCust[4] = new Customer(35,"Tony",100);

        int loopFlag=1;             //////// flag to make the program run while not equal 0
        System.out.println("welcome to our ATM app");
        while(loopFlag!=0)
        {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please select ATM type");
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
            switch (operationNo) {
                case 1:
                    System.out.println("you choosed deposit");////////// replace with implementation
                    break;
                case 2:
                    System.out.println("you choosed withdraw");
                    break;
                case 3:
                    System.out.println("you choosed check balance");
                    break;
                case 0:
                    System.out.println("you choosed exit");
                    loopFlag=0;             ///////////break the loop and exit the program
                    break;
                default:
                    System.out.println("you did not choose operation");
            }

        }

    }
}