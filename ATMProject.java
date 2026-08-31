import java.util.*;

 class ATM {
  Scanner sc;
  int Balance;
  int accountIndex;
  Account account;  
ATM(Account account, int accountIndex ,Scanner sc) {
    this.account = account;
    this.accountIndex = accountIndex;
      this.sc = sc;
    this.Balance = account.balance[accountIndex];
}
   void Menu(){
        int op; 
    do{
      
      System.out.println("\n================================");
      System.out.println("          ATM MENU");
      System.out.println("================================");
      System.out.println("1. Transaction History ");  
      System.out.println("2. Withdraw ");
      System.out.println("3. Deposit ");
      System.out.println("4. Transfer");
      System.out.println("5.Check Balance");
      System.out.println("6. Quit\n");

      System.out.print("Enter Your Option :");
      op=sc.nextInt();

      switch (op) {
        case 1:
              TransactionHistory();
          break;
        case 2:
            WithDraw();
            break;
        case 3:
            Deposit();
            break;
        case 4:
            Transfer();
            break;
        case 5:
             checkBalance();   
             
             break; 
        case 6:
                   System.out.println("\nLogged out successfully.");
                 break;  
        default:
         System.out.println("Please Enter a Valid Option!");
          break;
      }
    }while(op!=6);
    }

  void TransactionHistory(){
        System.out.println("\n----- Transaction History -----");

        if (account.history[accountIndex].isEmpty()) {

            System.out.println("No Transactions Yet.");

        } else {

            for (String transaction :account.history[accountIndex]) {

                System.out.println(transaction);
            }
        }

        System.out.println("-------------------------------");
    }


     void WithDraw(){
      System.out.println("Enter the Amount To Withdraw : ");
      int Withdraw=sc.nextInt();


        if (Withdraw <= 0) {

            System.out.println("Enter a Valid Amount!");
            return;
        }

          if (Withdraw > Balance) {

            System.out.println("Sorry! Insufficient Fund.");
            return;
        }
      
         Balance=Balance-Withdraw;
        account.balance[accountIndex] = Balance;
        account.history[accountIndex].add("Withdraw : " + Withdraw);
         System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance = " + Balance);        
      }
     


     void Deposit(){
      System.out.print("Enter the Amount To Deposit\n");
      int deposit=sc.nextInt();
      if (deposit <= 0) {

            System.out.println("Enter a Valid Amount!");
            return;
        }
       Balance=Balance+deposit;
       account.balance[accountIndex] = Balance;
       account.history[accountIndex].add("Deposit : " + deposit);

        System.out.println("Deposit Successful!");
        System.out.println("Current Balance = " + Balance);
     }
   void Transfer() {

    System.out.print("Enter Receiver User ID : ");
    String receiverId = sc.next();

    int receiverIndex = -1;

    // Find receiver account
    for (int i = 0; i < account.count; i++) {

        if (account.userId[i].equals(receiverId)) {
            receiverIndex = i;
            break;
        }
    }

    // Receiver not found
    if (receiverIndex == -1) {
        System.out.println("Receiver Account Not Found!");
        return;
    }

    // Cannot transfer to yourself
    if (receiverIndex == accountIndex) {
        System.out.println("You Cannot Transfer Money To Your Own Account!");
        return;
    }

    System.out.print("Enter Amount To Transfer : ");
    int amount = sc.nextInt();

    // Check amount
    if (amount <= 0) {
        System.out.println("Enter a Valid Amount!");
        return;
    }

    // Check sender balance
    if (amount > Balance) {
        System.out.println("Sorry! Insufficient Balance.");
        return;
    }

    // Deduct money from sender
    Balance = Balance - amount;

    account.balance[accountIndex] = Balance;

    // Add money to receiver
    account.balance[receiverIndex] =
            account.balance[receiverIndex] + amount;

    // Add transaction history for sender
    account.history[accountIndex]
            .add("Transfer To " + receiverId + " : " + amount);

    System.out.println("Transfer Successful!");
    System.out.println("Amount Transferred = " + amount);
    System.out.println("Remaining Balance = " + Balance);
}
     void checkBalance(){
      System.out.println("\nCurrent Balance = " + Balance);
     }
  
}
class Account {

    int count = 2;

    String[] userId = new String[10];
    int[] pin = new int[10];
    int[] balance = new int[10];

    @SuppressWarnings("unchecked")
    ArrayList<String>[] history = (ArrayList<String>[]) new ArrayList[10];

    Scanner sc;

    Account(Scanner sc) {

        this.sc = sc;

        // Default Account 1
        userId[0] = "Vrushali@18";
        pin[0] = 1234;
        balance[0] = 50000;
        history[0] = new ArrayList<>();

        // Default Account 2
        userId[1] = "Sanyukti@02";
        pin[1] = 1235;
        balance[1] = 50000;
        history[1] = new ArrayList<>();
    }

    

 void Account_() {

        if (count >= userId.length) {
            System.out.println("Account limit reached!");
            return;
        }

        System.out.print("Enter User Id : ");
        String newUserId = sc.next();
        for (int i = 0; i < count; i++) {

            if (userId[i].equals(newUserId)) {

                System.out.println("User ID already exists!");
                return;
            }
        }
        System.out.print("Enter PIN : ");
        int newPin = sc.nextInt();

        if (newPin < 1000 || newPin > 9999) {

            System.out.println("PIN must contain 4 digits.");
            return;
        }

        userId[count] = newUserId;
        pin[count] = newPin;
        balance[count] = 0;

        history[count] = new ArrayList<>();

        System.out.println("Account Created Successfully!");
        System.out.println("Your Account Balance = 0");

        count++;
    }
    void login() {

    int attempts = 0;

    while (attempts < 3) {

        System.out.print("Enter your UserId : ");
        String tocheckUserid = sc.next();

        System.out.print("Enter your PIN : ");
        int ToCheckPin = sc.nextInt();

        boolean loginSuccessfully = false;

        for (int i = 0; i < count; i++) {

            if (userId[i].equals(tocheckUserid)
                    && pin[i] == ToCheckPin) {

                System.out.println("Login Successfully");
                System.out.println("Welcome " + userId[i]);

                ATM a1 = new ATM(this, i, sc);
                a1.Menu();

                loginSuccessfully = true;
                break;
            }
        }

        if (loginSuccessfully) {
            return;
        }

        attempts++;

        System.out.println("Invalid Credentials!");

        if (attempts < 3) {
            System.out.println("Attempts Remaining : " + (3 - attempts));
        }
    }

    System.out.println("\nToo many incorrect attempts!");
    System.out.println("Access Denied...");
}  
    }
    

public class ATMProject{
   public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
    Account A1=new Account(sc);
       
        int op;
    do{
        System.out.println("\n================================");
        System.out.println("          ATM SYSTEM");
        System.out.println("================================");
        System.out.println("1.Create A New Account");
        System.out.println("2.Log In in exsistent Account");
        System.out.println("3.Exit");
        System.out.print("\n Enter your option ");
        op=sc.nextInt();
        switch (op) {
            case 1:
                   A1.Account_();
                break;
            case 2:
                 A1.login();
                break;
            case 3:
                System.out.println("Exit!!");
                break;    
            default:
                System.out.println("Please Enter valid Option ");
                break;
        }
    }while(op!=3);     
   sc.close();
   }
}  