import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    Random r= new Random();
    int attempt=0,op,round=0;
    String Ta,a;
    do{
        round++;
        System.out.println("\n\n--Number Guessing Game---");
        System.out.println("1.Easy Level(1-50) in 10 Attemtps");
        System.out.println("2.Medium Level(1 to 100)in 7 Attemtps");
        System.out.println("3.Hard Level (1 to 200) in 5 Attempts ");
        System.out.print("\n\nEnter Your option : ");
         op=sc.nextInt();
        switch (op) {
            case 1:
                  int num=r.nextInt(1,51);
                    int Guess;
                    System.out.println("Round "+round); 
               do{   
                System.out.print("Enter your Guess (1 to 50) ");
                     Guess=sc.nextInt();
                    attempt++;
                   if(Guess==num){
                    System.out.println("Corret Guess is "+attempt+" Attempte");
                }
                else if((attempt==10)){
                    System.out.println("YOU LOSS !!");
                    break;
                    }
                   else if(Guess>num)
                    System.out.println("Too High,");
                  else
                    System.out.println("Too Low");

                  }while( Guess!=num);
                 attempt=0;
                break;
            case 2:
                 num=r.nextInt(1,101);
                  System.out.println("Round "+round);
                 do{
                    System.out.print("Enter your Guess (1 to 100)");
                   Guess=sc.nextInt();
                   attempt++;    
                   if(Guess==num){
                    System.out.println("Corret Guess in "+ attempt+" Attempt\n");
                   }
                   else if((attempt==7)){
                    System.out.println("YOU LOSS !!");
                    break;
                    }
                   else if (Guess<num)
                    System.out.println("Too Low!");
                   else
                    System.out.println("Too High"); 
                 }while(Guess!=num);
                 attempt=0;
                break;
            case 3:
                 num=r.nextInt(1,201);
                 System.out.println("Round "+round);
                 do{
                     System.out.print("Enter your Guess between(1 to 200): ");
                     Guess=sc.nextInt();
                     attempt++;
                     if(Guess==num){
                        System.out.println("Corret Guess in "+ attempt +" Attempt\n");
                        }
                     else if((attempt==5)){
                    System.out.println("YOU LOSS !!");
                    break;
                    }
                     else if(Guess>num)
                        System.out.println("Too High");
                     else
                         System.out.println("Too Low");
                 }while (Guess!=num);
                 attempt=0;
                break;       
            default:
                System.out.println("invalid option");
                break;
        }    
        System.out.println("Do you want to play again(YES /NO)");
                 Ta=sc.next();
                a=Ta.toUpperCase();
      }while(a.equals("YES"));
        System.out.println("Thanks For Playing !!"); 
      sc.close();
}    
}
