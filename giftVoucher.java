import java.util.Scanner;

class giftVoucher 
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);

        //Taking input of gift voucher amount
        System.out.print("Enter Gift Voucher Amount: ");
        int v=inp.nextInt();
        int ip=1;
        int b=v;

        //Taking input of price of the items to be purchased
        while(ip>0 && b>0)
        {
            System.out.print("Enter Amount to spend: ");
            ip=inp.nextInt();

            if(ip<=b)
            {
                b=b-ip;
                if(ip<0)
                {
                    b=b+ip;
                }
                System.out.println("Remaining Balance: "+b);
            }
            else
            {
                System.out.println("Exceeds the balance of the Voucher");
            }
        }
        System.out.println("Voucher Finished");
    }
}