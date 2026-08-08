// Write a Java program to take two numbers as input and print the greater number.

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value 1: ");
       int input1= sc.nextInt();
       
       System.out.print("Enter the value 2: ");
       int input2= sc.nextInt();
       
       if(input1 > input2){
           System.out.println("Value 1 is greater number");
       }
       else{
           System.out.println("Value 2 is greater number ");
       }
    }
}
