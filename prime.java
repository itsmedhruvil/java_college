import java.util.*;


public class prime {
    public static void main(String args[])
    {
        System.out.println("This program will check wether a number is a prime number or not");
        int number,k=0,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        number=obj.nextInt();
        for (i=2; i<number;i++)
        {
            if(number%i==0)
                k=1;
        }
        if (k==1)
            System.out.println("Number "+number+" is not a prime number");
            else
                System.out.println("Number "+number+" is a prime number");

    }
}
