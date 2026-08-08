// Write a Java program to take a character as input and check whether it is a vowel or consonant using a switch statement.

import java.util.Scanner;

class P01 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the char: ");
       char vowel = sc.next().charAt(0);
       
       switch(vowel){
           case 'a':
           case 'A':
               System.out.print("A is vowel");
               break;
               
           case 'e':
           case 'E':
               System.out.print("E is vowel");
               break;
               
           case 'i':
           case 'I':
               System.out.print("I is vowel");
               break;
               
           case 'o':
           case 'O':
               System.out.print("O is vowel");
               break;
               
           case 'u':
           case 'U':
               System.out.print("U is vowel");
               break;
               
           default:
               System.out.print(vowel + " is Consonant");
               break;
       }
    }
}
