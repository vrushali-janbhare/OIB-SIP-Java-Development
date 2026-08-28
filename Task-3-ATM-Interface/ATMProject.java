import java.util.*;

 class ATM {
  ArrayList <String>history=new ArrayList<>();
  Scanner sc =new Scanner(System.in);
  int Balance=0;   
   void Menu(){
        int op; 
    do{
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
                 System.out.println(" Goodbye\n");
                 break;  
        default:
          System.out.print("Enter Valid Option ");
          break;
      }
    }while(op!=6);
    sc.close();}
  void TransactionHistory(){
        System.out.println("\n----- Transaction History -----");

    if (history.isEmpty()) {
        System.out.println("No Transactions Yet");
    } 
    else {
        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

    System.out.println("-------------------------------\n");
     }
     void WithDraw(){
      System.out.println("Enter the Amount To Withdraw : ");
      int Withdraw=sc.nextInt();
      if(Balance>Withdraw){
         Balance=Balance-Withdraw;
         history.add("Withdraw :"+Withdraw);
         System.out.println("Withdrawal Succesful");
      }
      else{
        System.out.println("Sorry!! insufficient Fund");
      }
     }
     void Deposit(){
      System.out.print("Enter the Amount To Deposit\n");
      int deposit=sc.nextInt();
      Balance=Balance+deposit;
      history.add("Deposit :"+deposit);
             System.out.println("Deposit Succesful");
     }
     void Transfer(){
      
     }
     void checkBalance(){
      System.out.println("Balance ="+Balance+"\n");
     }
  
}

// class Menu{
//     void Main_Menu(){
//      ATM p1=new ATM();
     
//     Scanner sc =new Scanner(System.in);
//         int op; 
//     do{
//       System.out.println("1. Transaction History ");  
//       System.out.println("2. Withdraw ");
//       System.out.println("3. Deposit ");
//       System.out.println("4. Transfer");
//       System.out.println("5.Check Balance");
//       System.out.println("6. Quit\n");
//       System.out.print("Enter Your Option :");
//       op=sc.nextInt();
//       switch (op) {
//         case 1:
//               p1.TransactionHistory();
//           break;
//         case 2:
//             p1.WithDraw();
//             break;
//         case 3:
//             p1.Deposit();
//             break;
//         case 4:
//             p1.Transfer();
//             break;
//         case 5:
//              p1.checkBalance();   
             
//              break; 
//         case 6:
//                  System.out.println(" Goodbye\n");
//                  break;  
//         default:
//           System.out.print("Enter Valid Option ");
//           break;
//       }
//     }while(op!=6);
//     sc.close();
//     }
// }


class Account {
    int count=2;
   String[] userId = new String[10]; 
   int[] pin = new int[10];
      
   void Account_()
   {
    userId[0]="Vrushali@18";
    pin[0]=1234;
    userId[1]="Sanyukti@02";
    pin[1]=12345;
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter User Id :");
      userId[count]=sc.nextLine();
      System.out.print("Enter PIN :");
      pin[count]=sc.nextInt();
      System.out.println("Account Create Succesfuly");
     sc.close();
   }
    void login(){
       ATM a1 =new ATM();
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter your UserId :");
      String  tocheckUserid=sc.nextLine();
      System.out.println("Enter your PIN :");
     int ToCheckPin=sc.nextInt();
      for( int i=0;i<10;i++)
      {
      if(userId[i].equals(tocheckUserid) && pin[i] == ToCheckPin){
          System.out.println("Login Succesfully");
          a1.Menu();
          break;
        }
        else{
            if(i==9)
            System.out.println("Invalid Credentials");
        }
      }
     sc.close();
    }
    
}
public class ATMProject{
   public static void main(String[] args) {
    Account A1=new Account();
        Scanner sc =new Scanner(System.in);
        int op;
    do{
        System.out.println("1.Create An New Account");
        System.out.println("2.Log In in exsistent Account");
        System.out.println("3.Exit");
        System.out.println("\n Enter your option ");
        op=sc.nextInt();
        switch (op) {
            case 1:
                   A1.Account_();
                break;
            case 2:
                 A1.login();
                break;
            default:
                System.out.println("Please Enter valid Option ");
                break;
        }
    }while(op!=3);     
   sc.close();
   }
}  