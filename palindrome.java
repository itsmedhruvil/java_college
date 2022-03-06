import java.util.Scanner;
class palindrome
{
    public static void main(String args[]) {
        Scanner obj =new Scanner(System.in);
        String S,S1="";int i;
        System.out.println("This will check wether the string is palindrome or not");
        System.out.println("Enter a string");
        S=obj.nextLine();
	int len=S.length()-1;
        for (i=len;i>=0;i--)
        {
            S1=S1+S.charAt(i);
        }
        if(S1.equalsIgnoreCase(S))
        System.out.println("String "+S+" is a palindrome");
        else
        System.out.println("String "+S+" is not a palindrome");
    }
}