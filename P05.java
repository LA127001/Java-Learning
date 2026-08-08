/* Write a Java program to take a student's marks as input and print their grade based on the following criteria:

    90–100 → A
    80–89 → B
    70–79 → C
    60–69 → D
    Below 60 → Fail

*/

import java.util.Scanner;

class P01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the marks: ");
       int marks = sc.nextInt();
       
       if(marks >= 90 && marks <= 100){
           System.out.println("Grade A");
       }
       else if(marks >= 80 && marks <= 89){
           System.out.println("Grade B");
       }
       else if(marks >= 70 && marks <= 79){
           System.out.println("Grade C");
       }
       else if(marks >= 60 && marks <= 69){
           System.out.println("Grade D");
       }
       else{
           System.out.println("Fail");
       }
    }
}
