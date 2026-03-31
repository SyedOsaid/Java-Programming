/* Write a Java program using a class that takes input of a student’s obtained marks.The program 
should calculate and display the corresponding grade based on the marks.Use appropriate methods 
in the class for input and grade calculation. */

import java.util.Scanner;

class GradingSystem
{
    public static void main(String[] args)
    {
        Scanner mar=new Scanner(System.in);

        //Taking input of the Obtained Marks
        System.out.print("Enter Obtained Marks: ");
        int a=mar.nextInt();

        //Calculating and giving grades based on obtained marks
        if((a>84) && (a<=100))
        {
            System.out.println("A Grade");
        }
        if((a>70) && (a<85))
        {
            System.err.println("B Grade");
        }
        if((a>60) && (a<71))
        {
            System.err.println("C Grade");
        }
        if((a>=50) && (a<61))
        {
            System.err.println("D Grade");
        }
        if(a<=50)
        {
            System.err.println("Fail");
        }
        if((a>100) || (a<0))
        {
            System.err.println("Enter Correct Marks");
        }
    }
}