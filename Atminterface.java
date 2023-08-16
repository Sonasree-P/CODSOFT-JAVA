import java.util.*;

public class Atminterface {

  public static void main(String[] args) {

    int pin = 1019;
    int balance = 1000;

    int addamount = 0;
    int withdraw = 0;

    String name;
    System.out.println("Enter your pin number: ");
    Scanner scanner = new Scanner(System.in);

    int password = scanner.nextInt();

    if (password == pin) {
      System.out.println("Enter the name:");
      name = scanner.next();
      System.out.println("Welcome" +" "+ name);

      while (true) {
        System.out.println("Press 1 to check Balance");
        System.out.println("Press 2 to deposit");
        System.out.println("Press 3 to withdraw");
        System.out.println("Press 4 to take Receipt");
        System.out.println("Press 5 to Exit ");
        int opt = scanner.nextInt();
      
        switch (opt) {

        case 1:
          System.out.println("Your current balance is" +" "+ balance);
          break;

        case 2:
          System.out.println("Enter your Add amount");
          addamount = scanner.nextInt();
          System.out.println("Your Amount is sucessfully Credited");
          balance = addamount + balance;
          /*
           * 1500 = 100 + 1500
           * balance=1600
           */
          System.out.println("Your balance is " +" "+balance);
          break;

        case 3:
          System.out.println("Enter Your Withdraw Amount:");
          withdraw = scanner.nextInt();
          if (withdraw > balance) {
            System.out.println("Your balance is in sufficient !");
            System.out.println("Enter amount less than available balance");
          }

          else {
            System.out.println("Transcations Sucessfully");
            System.out.println("Take your amount ");
            balance = balance - addamount;
            /*
             * 1500 = 1500-500
             * balance=1000
             */
            
          }
          break;

        case 4:
          System.out.println("Welcome to the ATM");
          System.out.println(" Your Current balance is" +" "+ balance);
          System.out.println("Amount deposited" +" "+ addamount);
          System.out.println("Amount Withdraw" + " "+withdraw);
          System.out.println("Take your Receipt");
          System.out.println("Thanks for coming ");

          break;

      }

      if (opt == 5) {
        System.out.println("Thank you");
        break;

      }
     

    } 

  }
   else{
      System.out.println("Your pin Number is Wrong,Enter the Valid Pin Number:");
    } 
}
}