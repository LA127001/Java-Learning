// Write a Java program to take three numbers as input and find the largest number using conditional statements.


import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value 1: ");
       int input1= sc.nextInt();
       
       System.out.print("Enter the value 2: ");
       int input2= sc.nextInt();
       
       System.out.print("Enter the value 3: ");
       int input3= sc.nextInt();
       
       if(input1 >= input2 && input1 >= input3){
           System.out.println("Value 1 is greater number");
       }
       else if(input2 >= input1 && input2 >= input3){
           System.out.println("Value 2 is greater number");
       }
       else{
           System.out.println("Value 3 is greater number ");
       }
    }
}
