// Write a Java program to take an integer as input and check whether the number is even or odd.

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value: ");
       int input= sc.nextInt();
       
       if(input % 2 == 0){
           System.out.println("Even");
       }
       else{
           System.out.println("Odd");
       }
    }
}
