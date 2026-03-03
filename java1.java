/* Write a Java program that takes input for the width and breadth of a place to be carpeted (in inches),
the price of the carpet per square metre, and a discount percentage.The program should calculate and
display the price before discount, the discount amount, and the final price after discount. */

import java.util.Scanner;

public class java1 
{
    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);

        //Taking input of the width,breadth, price of the carpet per sqr metre and discount percentage
        System.out.print("Enter width of of the place to be carpeted(in inches) = ");
        double w=inp.nextDouble();

        System.out.print("Enter breadth of of the place to be carpeted(in inches) = ");
        double b=inp.nextDouble();

        System.out.print("Enter the price of the carpet(per square metre) = ");
        double pc=inp.nextDouble();

        System.out.print("Enter the discount percentage that is to be given = ");
        double dp=inp.nextDouble();

        //Converting inches to feet
        double wc=w/12;
        double bc=b/12;

        //Calculating the Before Discount Price
        double bd=(wc*bc)*pc;
        
        System.out.println("Price before discount = " + bd);

        //Calculating the after discount price
        double a=dp*bd/100;
        double ad=bd-a;

        System.out.println("Price after discount = " + ad);

        System.out.print("Discount given= " + dp + "% (" + a + ")");
    }
}
