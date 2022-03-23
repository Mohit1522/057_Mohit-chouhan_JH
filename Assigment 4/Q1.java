import java.util.Scanner;
class Q1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int n =sc.nextInt();
if (n==0)
{
	System.out.println("number is neither even nor odd ");
}
if(n%2 ==0 && n!=0)
{
System.out.println("number is even number");
}

if(n%2 !=0)
System.out.println("number is odd number");
}
}