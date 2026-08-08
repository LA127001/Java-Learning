// Write a Java program to create a simple calculator using switch. The program should take two numbers and an operator (+, -, *, /) as input and display the result.

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the num1: ");
       int number1 = sc.nextInt();
       
       System.out.print("Enter the num2: ");
       int number2 = sc.nextInt();
       
       System.out.print("Enter the operation (+,-,*,/): ");
       char opera = sc.next().charAt(0);
       
       switch(opera){
           case '+':
               System.out.print("Addition of num1 & num2: " + (number1 + number2));
               break;
           case '-':
               System.out.print("Subtraction of num1 & num2: " + (number1 - number2));
               break;
           case '*':
               System.out.print("Multiply of num1 & num2: " + (number1 * number2));
               break;
           case '/':
               System.out.print("Divide of num1 & num2: " + (number1 / number2));
               break;
           default:
               System.out.print("Invalid operation");
               break;
       }
    }
}
