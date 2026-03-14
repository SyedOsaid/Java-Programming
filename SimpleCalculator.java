// Write a code in Java to make a Simple working Calculator by using Switch-Case //

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter first number: ");
        double fn=inp.nextDouble();

        System.out.print("Enter mathematical operation(+, -, *, /, %): ");
        String mo=inp.next();

        System.out.print("Enter second number: ");
        double sn=inp.nextDouble();

        double ans;
        switch(mo)
        {
            case "+":
                ans=fn+sn;
                System.out.println(fn + " + " + sn + "=" + ans);
                break;
            case "-":
                ans=fn-sn;
                System.out.println(fn + " - " + sn + "=" + ans);
                break;
            case "*":
                ans=fn*sn;
                System.out.println(fn + " x " + sn + "=" + ans);
                break;
            case "/":
                if(sn!=0)
                {
                ans=fn/sn;
                System.out.println(fn + " / " + sn + "=" + ans);
                break;
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                }
            case "%":
                ans=fn%sn;
                System.out.println(fn + " % " + sn + "=" + ans);
                break;
            default:
                System.out.println("Wrong Operator used!!");
                break;
        }

        inp.close();

    }
}
