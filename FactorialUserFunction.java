//Write a code in Java to calculate the factorial of any integer by using user defined function.

import java.util.Scanner;

public class FactorialUserFunction 
{
    public static int fact(int n)
    {
        int f=1;
        int i=2;

        while(i<=n)
        {
            f=f*i;
            i=i+1;
        }
        return(f);
    }

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the Number to find out its factorial= ");
        int n=inp.nextInt();

        int r=fact(n);
        System.out.println(r);
    }
}
