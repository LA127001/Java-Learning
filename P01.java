// Write a Java program to take an integer as input and check whether the number is even or odd.

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input= sc.nextInt();
       
       System.out.println("Input number is " + input);
       
       if(input % 2 == 0){
           System.out.println("Even");
       }
       else{
           System.out.println("Odd");
       }
    }
}
