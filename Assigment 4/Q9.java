import java.util.Scanner;
class Q9
{
public static void main(String args[])
{
Scanner od= new Scanner(System.in);
System.out.println("enter the number");
int n= od.nextInt();
int r;
int sum=0;
while(n>0)
{
r=n%10;
sum= sum+r;
n=n/10;
}
System.out.println("sum of the digits is="+sum);
}
}



