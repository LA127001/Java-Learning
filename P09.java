/* Write a Java program to create a menu-driven program using switch with the following options:

  1 → Check Balance
  2 → Deposit Money
  3 → Withdraw Money
  4 → Exit
*/


import java.util.Scanner;

class P01 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int number = sc.nextInt();
       
       switch(number){
           case 1:
               System.out.print("Check Balance");
               break;
           case 2:
               System.out.print("Deposit Money");
               break;
           case 3:
               System.out.print("Withdraw Money");
               break;
           case 4:
               System.out.print("Exit");
               break;
           default:
               System.out.print("Invalid options");
               break;
       }
    }
}
