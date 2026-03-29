//Write a java code to make a more advanced working Calculator by using switch case//

import java.util.Scanner;

public class AdvancedCalculator 
{
        public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);

        double ans;

        System.out.print("Enter first number: ");
        double fn=inp.nextDouble();

        System.out.print("Enter mathematical operation(+, -, *, /, %, #, $, @)= "); //# means power || $ means square root || @ means log//
        String mo=inp.next();

        switch(mo)
        {
            case "#":
                System.out.print("Enter the power: ");
                double po=inp.nextDouble();
                ans=Math.pow(fn,po);
                System.out.println(fn + "^" + po + "=" + ans);
                break;
            case "$":
                ans=Math.sqrt(fn);
                System.out.println("Square root of " + fn + "=" + ans);
                break;
            case "@":
                ans=Math.log(fn);
                System.out.println("Logarithm of " + fn + "=" + ans);
                break;
            default:
                System.out.print("Enter second number: ");
                double sn=inp.nextDouble();

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
        }

        inp.close();

    }
}
