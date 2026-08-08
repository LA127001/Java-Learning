// Write a Java program to take a number as input and check whether it is positive, negative, or zero.

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value: ");
       int input= sc.nextInt();
       
       if(input > 0){
           System.out.println("Positive");
       }
       else if (input < 0){
           System.out.println("Negative");
       }
       else{
           System.out.println("Zero");
       }
    }
}
